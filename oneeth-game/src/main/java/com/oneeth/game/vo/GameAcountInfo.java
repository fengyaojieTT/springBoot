package com.oneeth.game.vo;

import java.util.List;

import com.oneeth.game.entity.GameInitCode;
import com.oneeth.game.entity.GameKey;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "GameAcountInfo")
public class GameAcountInfo {

	@ApiModelProperty(value = "钱包地址信息",name = "gameInitCode")
	private GameInitCode gameInitCode;
	@ApiModelProperty(value = "钱包地址参与记录",dataType="List[GameKey]",name = "gameKey")
	private List<GameKey> gameKey;

	public GameInitCode getGameInitCode() {
		return gameInitCode;
	}

	public void setGameInitCode(GameInitCode gameInitCode) {
		this.gameInitCode = gameInitCode;
	}

	public List<GameKey> getGameKey() {
		return gameKey;
	}

	public void setGameKey(List<GameKey> gameKey) {
		this.gameKey = gameKey;
	}

}
