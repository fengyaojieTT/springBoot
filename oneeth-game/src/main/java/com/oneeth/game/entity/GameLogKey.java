package com.oneeth.game.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("游戏记录")
public class GameLogKey {
	@ApiModelProperty("游戏编码")
    private String gameCode;
	@ApiModelProperty("当前期号")
	private Integer termNumber;

    public GameLogKey(String gameCode, Integer termNumber) {
        this.gameCode = gameCode;
        this.termNumber = termNumber;
    }

    public GameLogKey() {
        super();
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode == null ? null : gameCode.trim();
    }

    public Integer getTermNumber() {
        return termNumber;
    }

    public void setTermNumber(Integer termNumber) {
        this.termNumber = termNumber;
    }
}