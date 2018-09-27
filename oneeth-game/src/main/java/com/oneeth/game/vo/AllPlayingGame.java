package com.oneeth.game.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.oneeth.game.common.IgnoreFixed;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "AllPlayingGame", reference = "com.oneeth.game.vo.AllPlayingGame", description = "各个游戏字段详情")
@JsonInclude(Include.NON_NULL)
public class AllPlayingGame {

	@ApiModelProperty(value = "当前游戏类型id", name = "id")
	private String id;
	@ApiModelProperty(value = "游戏编码", name = "gameCode")
	private String gameCode;
	@ApiModelProperty(value = "游戏最小参与金额", name = "minimumMoney")
	private BigDecimal minimumMoney;
	@ApiModelProperty(value = "当前游戏类型默认请码", name = "defaultCode")
	private String defaultCode;
	@ApiModelProperty(value = "游戏合约", name = "gameContract")
	private String gameContract;
	@IgnoreFixed
	@ApiModelProperty(value = "游戏合约owner私钥", name = "ownerPrivateKey")
	private String ownerPrivateKey;
	@ApiModelProperty(value = "游戏类型", name = "gameType")
	private String gameType;
	@ApiModelProperty(value = "结束金额", name = "endPoint")
	private BigDecimal endPoint;
	@ApiModelProperty(value = "当前游戏期数", name = "termNumber")
	private Integer termNumber;
	@ApiModelProperty(value = "当前参与人数", name = "currCount")
	private Integer currCount;
	@ApiModelProperty(value = "当前参与金额", name = "currMoney")
	private BigDecimal currMoney;
	@ApiModelProperty(value = "游戏状态ING运行中END结束AWARD派奖完成", name = "gameStatus")
	private String gameStatus;
	@ApiModelProperty(value = "中奖地址", name = "lucklyAddress")
	private String lucklyAddress;
	@ApiModelProperty(value = "中奖号码", name = "lucklyCode")
	private String lucklyCode;
	@ApiModelProperty(value = "中奖依赖hash", name = "lucklyHash")
	private String lucklyHash;
	@ApiModelProperty(value = "派奖hash", name = "awardHash")
	private String awardHash;
	@ApiModelProperty(value = "游戏开始时间", name = "startTime")
	private Date startTime;
	@ApiModelProperty(value = "游戏结束时间", name = "endTime")
	private Date endTime;
	@ApiModelProperty(value = "游戏充值地址", name = "rechargeWalletaddress")
	private String rechargeWalletaddress;
	@ApiModelProperty(value = "邀请码", name = "myInvitCode")
	private String myInvitCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public BigDecimal getMinimumMoney() {
		return minimumMoney;
	}

	public void setMinimumMoney(BigDecimal minimumMoney) {
		this.minimumMoney = minimumMoney;
	}

	public String getDefaultCode() {
		return defaultCode;
	}

	public void setDefaultCode(String defaultCode) {
		this.defaultCode = defaultCode;
	}

	public String getGameContract() {
		return gameContract;
	}

	public void setGameContract(String gameContract) {
		this.gameContract = gameContract;
	}

	public String getOwnerPrivateKey() {
		return ownerPrivateKey;
	}

	public void setOwnerPrivateKey(String ownerPrivateKey) {
		this.ownerPrivateKey = ownerPrivateKey;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public BigDecimal getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(BigDecimal endPoint) {
		this.endPoint = endPoint;
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
		this.gameStatus = gameStatus;
	}

	public String getLucklyAddress() {
		return lucklyAddress;
	}

	public void setLucklyAddress(String lucklyAddress) {
		this.lucklyAddress = lucklyAddress;
	}

	public String getLucklyCode() {
		return lucklyCode;
	}

	public void setLucklyCode(String lucklyCode) {
		this.lucklyCode = lucklyCode;
	}

	public String getLucklyHash() {
		return lucklyHash;
	}

	public void setLucklyHash(String lucklyHash) {
		this.lucklyHash = lucklyHash;
	}

	public String getAwardHash() {
		return awardHash;
	}

	public void setAwardHash(String awardHash) {
		this.awardHash = awardHash;
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

	public String getRechargeWalletaddress() {
		return rechargeWalletaddress;
	}

	public void setRechargeWalletaddress(String rechargeWalletaddress) {
		this.rechargeWalletaddress = rechargeWalletaddress;
	}

	public String getMyInvitCode() {
		return myInvitCode;
	}

	public void setMyInvitCode(String myInvitCode) {
		this.myInvitCode = myInvitCode;
	}

	public Integer getTermNumber() {
		return termNumber;
	}

	public void setTermNumber(Integer termNumber) {
		this.termNumber = termNumber;
	}
}
