package com.oneeth.game.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.oneeth.game.common.PageBean;
import com.oneeth.game.entity.GameLog;
import com.oneeth.game.entity.GameLogExample;
import com.oneeth.game.entity.GameLogExample.Criteria;
import com.oneeth.game.enums.GameStatus;
import com.oneeth.game.enums.GameType;
import com.oneeth.game.mapper.GameLogMapper;
import com.oneeth.game.service.GameInfoService;
import com.oneeth.game.vo.AllPlayingGame;
import com.oneeth.game.vo.AllTypeGameArray;
import com.oneeth.game.vo.SimpleGameLogArray;

@Service
public class GameInfoServiceImpl implements GameInfoService {

	@Autowired
	private GameLogMapper gameLogMapper;

	@Override
	public AllTypeGameArray getAll() {
		AllTypeGameArray allTypeGameArray = new AllTypeGameArray();
		List<AllPlayingGame> allPlayingGames = gameLogMapper.selectAllGame();
		Map<String, List<AllPlayingGame>> collect = allPlayingGames.stream()
				.collect(Collectors.groupingBy(AllPlayingGame::getGameType));
		allTypeGameArray.setWinTreasure(collect.get(GameType.WINTREASURE.getValue()));
		allTypeGameArray.setDoubleFlight((collect.get(GameType.DOUBLEFLIGHT.getValue())));
		return allTypeGameArray;
	}

	@Override
	public AllPlayingGame getWinGameInfo(String gameCode, Integer termNumber, String invitCode) {
		AllPlayingGame allPlayingGame = new AllPlayingGame();
		allPlayingGame.setGameCode(gameCode);
		allPlayingGame.setTermNumber(termNumber);
		allPlayingGame.setMyInvitCode(invitCode);
		allPlayingGame = gameLogMapper.selectGameInfo(allPlayingGame);
		return allPlayingGame;
	}

	@Override
	public SimpleGameLogArray getWinGameLog(String gameCode,Integer pageNumber, Integer pageSize) {
		GameLogExample example = new GameLogExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andGameCodeEqualTo(gameCode);
		createCriteria.andGameStatusNotEqualTo(GameStatus.ING.getValue());
		PageHelper.startPage(pageNumber, pageSize);
		List<GameLog> gameLogs = gameLogMapper.selectByExample(example);
		PageBean<GameLog> pageBean = new PageBean<GameLog>(gameLogs);
		SimpleGameLogArray simpleGameLogArray = new SimpleGameLogArray();
		simpleGameLogArray.setWinTreasure(pageBean);
		return simpleGameLogArray;
	}

}
