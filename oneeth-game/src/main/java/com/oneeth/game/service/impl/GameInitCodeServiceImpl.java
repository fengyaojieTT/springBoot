package com.oneeth.game.service.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;

import com.aliyun.openservices.shade.org.apache.commons.codec.binary.Hex;
import com.github.pagehelper.PageHelper;
import com.oneeth.game.entity.GameInitCode;
import com.oneeth.game.entity.GameInitCodeExample;
import com.oneeth.game.entity.GameInitCodeExample.Criteria;
import com.oneeth.game.entity.GameKey;
import com.oneeth.game.entity.GameKeyExample;
import com.oneeth.game.mapper.GameInitCodeMapper;
import com.oneeth.game.mapper.GameKeyMapper;
import com.oneeth.game.service.GameInitCodeService;
import com.oneeth.game.utils.StringTools;
import com.oneeth.game.vo.GameAcountInfo;

@Service
public class GameInitCodeServiceImpl implements GameInitCodeService {

	@Autowired
	private GameInitCodeMapper gameInitCodeMapper;
	@Autowired
	private GameKeyMapper gameKeyMapper;
	@Autowired
	private StringRedisTemplate redisTemplate;

	@Transactional
	@Override
	public GameAcountInfo getOrSetAcountInfo(String gameCode, String walletAddress) throws Exception {
		GameAcountInfo gameAcountInfo = new GameAcountInfo();
		GameInitCodeExample example = new GameInitCodeExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andInvitWalletaddressEqualTo(walletAddress);
		createCriteria.andGameCodeEqualTo(gameCode);
		List<GameInitCode> gameInitCodes = gameInitCodeMapper.selectByExample(example);
		if (!gameInitCodes.isEmpty()) {
			gameAcountInfo.setGameInitCode(gameInitCodes.get(0));
			GameKeyExample gameKeyExample = new GameKeyExample();
			gameKeyExample.createCriteria().andFromWalletaddressEqualTo(walletAddress).andGameCodeEqualTo(gameCode);
			PageHelper.startPage(1, 10, "term_number desc");
			List<GameKey> gameKeys = gameKeyMapper.selectByExample(gameKeyExample);
			gameAcountInfo.setGameKey(gameKeys);
			return gameAcountInfo;
		}
		Long codeHigh = redisTemplate.opsForValue().increment("ONEETH_INITCODE", 1);
		GameInitCode gameInitCode = new GameInitCode();
		String password = UUID.randomUUID().toString().replaceAll("-", "");
		ByteArrayOutputStream ous = new ByteArrayOutputStream();
		WalletUtils.generateFullNewWalletStream(password, ous);
		ByteArrayInputStream ins = new ByteArrayInputStream(ous.toByteArray());
		Credentials credentials = WalletUtils.loadCredentials(password, ins);
		gameInitCode.setGameCode(gameCode);
		gameInitCode
				.setPrivtateKey("0x" + Hex.encodeHexString(credentials.getEcKeyPair().getPrivateKey().toByteArray()));
		gameInitCode.setRechargeWalletaddress(credentials.getAddress());
		gameInitCode.setInvitWalletaddress(walletAddress);
		gameInitCode.setCreatedTime(new Date());
		gameInitCode.setIsRecharge("0");
		gameInitCode.setIsDefault("0");
		gameInitCode.setCreatedBy("SYSTEM");
		gameInitCode.setId(UUID.randomUUID().toString().replace("-", ""));
		gameInitCode.setMyInvitCode(StringTools.toBase58Five(codeHigh));
		gameInitCode.setRevision(0);
		gameInitCodeMapper.insertSelective(gameInitCode);
		redisTemplate.opsForHash().put("ONEETH_ADDRESSMAP", gameInitCode.getRechargeWalletaddress(),
				gameInitCode.getGameCode());
		gameAcountInfo.setGameInitCode(gameInitCode);
		return gameAcountInfo;
	}

}
