package com.oneeth.game.vo;


import com.oneeth.game.common.PageBean;
import com.oneeth.game.entity.GameLog;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "SimpleGameLogArray")
public class SimpleGameLogArray{

	@ApiModelProperty(value = "游戏开奖记录", name = "winGameLog")
	private PageBean<GameLog> winGameLog;
	
	public PageBean<GameLog> getWinTreasure() {
		return winGameLog;
	}

	public void setWinTreasure(PageBean<GameLog> winGameLog) {
		this.winGameLog = winGameLog;
	}


}
