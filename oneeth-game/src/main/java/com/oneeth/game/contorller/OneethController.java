package com.oneeth.game.contorller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oneeth.game.common.OneethException;
import com.oneeth.game.common.OneethResponse;
import com.oneeth.game.common.ResponseFormat;
import com.oneeth.game.service.GameInfoService;
import com.oneeth.game.service.GameInitCodeService;
import com.oneeth.game.utils.ReflectionUtils;
import com.oneeth.game.vo.AllPlayingGame;
import com.oneeth.game.vo.AllTypeGameArray;
import com.oneeth.game.vo.GameAcountInfo;
import com.oneeth.game.vo.SimpleGameLogArray;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "oneethController", tags = { "oneeth游戏接口" })
@RestController
@RequestMapping("/oneeth")
public class OneethController {
	private static final Logger LOG = LoggerFactory.getLogger(OneethController.class);

	@Autowired
	private GameInitCodeService gameInitCodeService;
	@Autowired
	private GameInfoService gameInfoService;

	@ApiOperation(value = "获取所有进行中的游戏", notes = "首页夺宝和速配")
	@GetMapping(value = "/allGame")
	@ResponseBody
	public OneethResponse<AllTypeGameArray> get() {
		AllTypeGameArray allTypeGameArray  = gameInfoService.getAll();
		return ResponseFormat.retParam(200, allTypeGameArray);
	}

	@ApiOperation(value = "游戏详情")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "path", name = "gameCode", value = "游戏编码", required = true, dataType = "String"),
			@ApiImplicitParam(paramType = "path", name = "termNumber", value = "游戏期号", required = true, dataType = "Integer"),
			@ApiImplicitParam(paramType = "path", name = "invitCode", value = "邀请码", required = true, dataType = "Integer") })
	@GetMapping(value = "/winGameInfo/{gameCode}/{termNumber}/{invitCode}")
	@ResponseBody
	public OneethResponse<AllPlayingGame> getWinGameInfo(@PathVariable String gameCode,
			@PathVariable Integer termNumber, @PathVariable String invitCode) {
			if (StringUtils.isEmpty(gameCode) || termNumber < 1 || StringUtils.isEmpty(invitCode)) {
				throw new OneethException(10002);
			}
			AllPlayingGame allPlayingGame = gameInfoService.getWinGameInfo(gameCode, termNumber, invitCode);
		return ResponseFormat.retParam(200, allPlayingGame);
	}

	@ApiOperation(value = "查询开奖记录")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "path", name = "gameCode", value = "游戏编码", required = true, dataType = "String"),
			@ApiImplicitParam(paramType = "path", name = "pageNumber", value = "页码", required = false, dataType = "Integer"),
			@ApiImplicitParam(paramType = "path", name = "pageSize", value = "页大小", required = false, dataType = "Integer") })
	@GetMapping(value = { "/winGameLog/{gameCode}/{pageNumber}/{pageSize}", "/winGameLog/{gameCode}",
			"/winGameLog/{gameCode}/{pageSize}" })
	@ResponseBody
	public OneethResponse<SimpleGameLogArray> getHistroyGameLog(@PathVariable String gameCode,
			@PathVariable Integer pageNumber, @PathVariable Integer pageSize) {
			if (StringUtils.isEmpty(gameCode)) {
				throw new OneethException(10002);
			}
			if (pageNumber == null || pageSize == null) {
				pageNumber = 1;
				pageSize = 5;
			}
			SimpleGameLogArray simpleGameLogArray= gameInfoService.getWinGameLog(gameCode, pageNumber, pageSize);
		
		return ResponseFormat.retParam(200, simpleGameLogArray);
	}

	@ApiOperation(value = "查询或者生成地址账户信息")
	@ApiImplicitParams({
			@ApiImplicitParam(paramType = "path", name = "gameCode", value = "游戏编码", required = true, dataType = "String"),
			@ApiImplicitParam(paramType = "path", name = "walletAddress", value = "钱包地址", required = false, dataType = "Integer") })
	@GetMapping("/queryOrGeneratorInvitCode/{gameCode}/{walletAddress}")
	@ResponseBody
	public OneethResponse<GameAcountInfo> queryOrGeneratorInvitCode(@PathVariable String gameCode,
			@PathVariable String walletAddress) throws Exception {
		if (StringUtils.isEmpty(gameCode) || StringUtils.isEmpty(walletAddress)
				|| !ReflectionUtils.isHexNumber(walletAddress)) {
			throw new OneethException(10002);
		}
		GameAcountInfo gameAcountInfo = gameInitCodeService.getOrSetAcountInfo(gameCode, walletAddress);
		return ResponseFormat.retParam(200, gameAcountInfo);
	}
//	@ApiOperation(value = "开奖详情")
//	@ApiImplicitParams({
//		@ApiImplicitParam(paramType = "path", name = "gameCode", value = "游戏编码", required = true, dataType = "String"),
//		@ApiImplicitParam(paramType = "path", name = "termNumber", value = "游戏期号", required = true, dataType = "Integer"),
//		@ApiImplicitParam(paramType = "path", name = "walletAddress", value = "钱包地址", required = false, dataType = "Integer") })
//	@GetMapping("/queryOrGeneratorInvitCode/{gameCode}/{termNumber}/{walletAddress}")
//	@ResponseBody
//	public OneethResponse<GameKey> queryGameLogInfo(@PathVariable String gameCode,@PathVariable Integer termNumber,
//			@PathVariable String walletAddress) throws Exception {
//		if (StringUtils.isEmpty(gameCode)|| termNumber < 1 || StringUtils.isEmpty(walletAddress)
//				|| !ReflectionUtils.isHexNumber(walletAddress)) {
//			throw new OneethException(10002);
//		}
//		gameInitCodeService.getLogInfoByAcount(gameCode,termNumber, walletAddress);
//		return ResponseFormat.retParam(200, gameAcountInfo);
//	}

}