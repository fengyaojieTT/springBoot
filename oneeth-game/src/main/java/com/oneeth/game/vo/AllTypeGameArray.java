package com.oneeth.game.vo;

import java.util.List;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "AllTypeGameArray",reference="com.oneeth.game.vo.AllPlayingGame")
public class AllTypeGameArray{

	@ApiModelProperty(value = "夺宝游戏数组", name = "winTreasure",dataType="List[AllPlayingGame]")
	private List<AllPlayingGame> winTreasure;
	@ApiModelProperty(value = "速配游戏数组", name = "doubleFlight",dataType="List[AllPlayingGame]")
	private List<AllPlayingGame>  doubleFlight;

	public List<AllPlayingGame> getDoubleFlight() {
		return doubleFlight;
	}

	public void setDoubleFlight(List<AllPlayingGame> doubleFlight) {
		this.doubleFlight = doubleFlight;
	}

	public List<AllPlayingGame> getWinTreasure() {
		return winTreasure;
	}

	public void setWinTreasure(List<AllPlayingGame> winTreasure) {
		this.winTreasure = winTreasure;
	}


}
