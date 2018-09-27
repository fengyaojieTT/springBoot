package com.oneeth.game.service;

import com.oneeth.game.vo.AllPlayingGame;
import com.oneeth.game.vo.AllTypeGameArray;
import com.oneeth.game.vo.SimpleGameLogArray;

public interface GameInfoService {
	/**
	 * 查询所有正在进行中的游戏
	 * 无参
	 * @return AllTypeGameArray
	 */
	public AllTypeGameArray getAll();
	/**
	 * 游戏详情
	 * @param gamecode termNumber invitCode 
	 * @return AllPlayingGame
	 */
	public AllPlayingGame getWinGameInfo(String gamecode, Integer termNumber, String invitCode);
	/**
	 * 单个游戏历史开奖记录
	 * @param gameCode pageNumber pageSize 
	 * @return SimpleGameLogArray
	 */
	public SimpleGameLogArray getWinGameLog(String gameCode, Integer pageNumber, Integer pageSize);

}
