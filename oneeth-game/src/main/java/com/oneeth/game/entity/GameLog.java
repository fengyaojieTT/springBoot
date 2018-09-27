package com.oneeth.game.entity;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel("游戏记录")
public class GameLog extends GameLogKey {
	@ApiModelProperty(value = "ID")
    private String id;
	@ApiModelProperty(value = "本期参与人数")
    private Integer currCount;
	@ApiModelProperty(value = "本期参与金额")
    private BigDecimal currMoney;
	@ApiModelProperty(value = "游戏状态")
    private String gameStatus;
	@ApiModelProperty(value = "中奖地址")
    private String lucklyAddress;
	@ApiModelProperty(value = "中奖号码")
    private String lucklyCode;
	@ApiModelProperty(value = "中奖依赖号码")
    private String lucklyHash;
	@ApiModelProperty(value = "游戏合约地址")
    private String gameContract;
	@ApiModelProperty(value = "派奖hash")
    private String awardHash;
	@ApiModelProperty(value = "开始时间")
    private Date startTime;
	@ApiModelProperty(value = "结束时间")
    private Date endTime;

    private String free1;

    private String free2;

    private String free3;

    private Integer revision;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public GameLog(String gameCode, Integer termNumber, String id, Integer currCount, BigDecimal currMoney, String gameStatus, String lucklyAddress, String lucklyCode, String lucklyHash, String gameContract, String awardHash, Date startTime, Date endTime, String free1, String free2, String free3, Integer revision, String createdBy, Date createdTime, String updatedBy, Date updatedTime) {
        super(gameCode, termNumber);
        this.id = id;
        this.currCount = currCount;
        this.currMoney = currMoney;
        this.gameStatus = gameStatus;
        this.lucklyAddress = lucklyAddress;
        this.lucklyCode = lucklyCode;
        this.lucklyHash = lucklyHash;
        this.gameContract = gameContract;
        this.awardHash = awardHash;
        this.startTime = startTime;
        this.endTime = endTime;
        this.free1 = free1;
        this.free2 = free2;
        this.free3 = free3;
        this.revision = revision;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public GameLog() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getCurrCount() {
        return currCount;
    }

    public void setCurrCount(Integer currCount) {
        this.currCount = currCount;
    }

    public BigDecimal getCurrMoney() {
        return currMoney;
    }

    public void setCurrMoney(BigDecimal currMoney) {
        this.currMoney = currMoney;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus == null ? null : gameStatus.trim();
    }

    public String getLucklyAddress() {
        return lucklyAddress;
    }

    public void setLucklyAddress(String lucklyAddress) {
        this.lucklyAddress = lucklyAddress == null ? null : lucklyAddress.trim();
    }

    public String getLucklyCode() {
        return lucklyCode;
    }

    public void setLucklyCode(String lucklyCode) {
        this.lucklyCode = lucklyCode == null ? null : lucklyCode.trim();
    }

    public String getLucklyHash() {
        return lucklyHash;
    }

    public void setLucklyHash(String lucklyHash) {
        this.lucklyHash = lucklyHash == null ? null : lucklyHash.trim();
    }

    public String getGameContract() {
        return gameContract;
    }

    public void setGameContract(String gameContract) {
        this.gameContract = gameContract == null ? null : gameContract.trim();
    }

    public String getAwardHash() {
        return awardHash;
    }

    public void setAwardHash(String awardHash) {
        this.awardHash = awardHash == null ? null : awardHash.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getFree1() {
        return free1;
    }

    public void setFree1(String free1) {
        this.free1 = free1 == null ? null : free1.trim();
    }

    public String getFree2() {
        return free2;
    }

    public void setFree2(String free2) {
        this.free2 = free2 == null ? null : free2.trim();
    }

    public String getFree3() {
        return free3;
    }

    public void setFree3(String free3) {
        this.free3 = free3 == null ? null : free3.trim();
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}