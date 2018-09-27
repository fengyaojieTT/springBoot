package com.oneeth.game.service;

import com.oneeth.game.vo.GameAcountInfo;
/**
 * 地址账户接口类
 * @author Mr.Feng
 *
 */
public interface GameInitCodeService {
	/**
	 * 
	 * @param gameCode  游戏编码
	 * @param walletAddress 钱包地址
	 * @return
	 * @throws Exception 
	 */
	GameAcountInfo getOrSetAcountInfo(String gameCode,String walletAddress) throws Exception;

	GameAcountInfo getLogInfoByAcount(String gameCode, Integer termNumber, String walletAddress);
	
	
}
