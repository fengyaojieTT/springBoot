package com.oneeth.game.entity;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "GameInitCode",description = "钱包地址信息")
public class GameInitCode {

	@ApiModelProperty(value = "ID")
	private String id;
	@ApiModelProperty(value = "游戏编码")
	private String gameCode;
	@ApiModelProperty(value = "我的邀请码")
	private String myInvitCode;
	@ApiModelProperty(value = "我的钱包地址")
	private String invitWalletaddress;
	@ApiModelProperty(value = "充值钱包地址")
	private String rechargeWalletaddress;
	@ApiModelProperty(value = "充值钱包地址私钥")
	private String privtateKey;
	@ApiModelProperty(value = "是否充值")
	private String isRecharge;
	@ApiModelProperty(value = "是否默认邀请码")
	private String isDefault;
	@ApiModelProperty(value = "中奖次数")
	private Integer lucklyCount;
	@ApiModelProperty(value = "中奖金额")
	private BigDecimal lucklyAmount;
	@ApiModelProperty(value = "参与次数")
	private Integer partakeCount;

	private String free1;

	private String free2;

	private String free3;

	private Integer revision;

	private String createdBy;

	private Date createdTime;

	private String updatedBy;

	private Date updatedTime;

	public GameInitCode(String id, String gameCode, String myInvitCode, String invitWalletaddress,
			String rechargeWalletaddress, String privtateKey, String isRecharge, String isDefault, Integer lucklyCount,
			BigDecimal lucklyAmount, Integer partakeCount, String free1, String free2, String free3, Integer revision,
			String createdBy, Date createdTime, String updatedBy, Date updatedTime) {
		this.id = id;
		this.gameCode = gameCode;
		this.myInvitCode = myInvitCode;
		this.invitWalletaddress = invitWalletaddress;
		this.rechargeWalletaddress = rechargeWalletaddress;
		this.privtateKey = privtateKey;
		this.isRecharge = isRecharge;
		this.isDefault = isDefault;
		this.lucklyCount = lucklyCount;
		this.lucklyAmount = lucklyAmount;
		this.partakeCount = partakeCount;
		this.free1 = free1;
		this.free2 = free2;
		this.free3 = free3;
		this.revision = revision;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.updatedBy = updatedBy;
		this.updatedTime = updatedTime;
	}

	public GameInitCode() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode == null ? null : gameCode.trim();
	}

	public String getMyInvitCode() {
		return myInvitCode;
	}

	public void setMyInvitCode(String myInvitCode) {
		this.myInvitCode = myInvitCode == null ? null : myInvitCode.trim();
	}

	public String getInvitWalletaddress() {
		return invitWalletaddress;
	}

	public void setInvitWalletaddress(String invitWalletaddress) {
		this.invitWalletaddress = invitWalletaddress == null ? null : invitWalletaddress.trim();
	}

	public String getRechargeWalletaddress() {
		return rechargeWalletaddress;
	}

	public void setRechargeWalletaddress(String rechargeWalletaddress) {
		this.rechargeWalletaddress = rechargeWalletaddress == null ? null : rechargeWalletaddress.trim();
	}

	public String getPrivtateKey() {
		return privtateKey;
	}

	public void setPrivtateKey(String privtateKey) {
		this.privtateKey = privtateKey == null ? null : privtateKey.trim();
	}

	public String getIsRecharge() {
		return isRecharge;
	}

	public void setIsRecharge(String isRecharge) {
		this.isRecharge = isRecharge == null ? null : isRecharge.trim();
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault == null ? null : isDefault.trim();
	}

	public Integer getLucklyCount() {
		return lucklyCount;
	}

	public void setLucklyCount(Integer lucklyCount) {
		this.lucklyCount = lucklyCount;
	}

	public BigDecimal getLucklyAmount() {
		return lucklyAmount;
	}

	public void setLucklyAmount(BigDecimal lucklyAmount) {
		this.lucklyAmount = lucklyAmount;
	}

	public Integer getPartakeCount() {
		return partakeCount;
	}

	public void setPartakeCount(Integer partakeCount) {
		this.partakeCount = partakeCount;
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