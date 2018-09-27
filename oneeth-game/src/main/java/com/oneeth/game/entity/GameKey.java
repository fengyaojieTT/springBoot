package com.oneeth.game.entity;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "GameKey",description = "游戏KEY信息")
public class GameKey {
	
	@ApiModelProperty(value = "ID")
    private String id;
	@ApiModelProperty(value = "获得类型")
    private String getType;
	@ApiModelProperty(value = "游戏编码")
    private String gameCode;
	@ApiModelProperty(value = "游戏期号")
    private String termNumber;
	@ApiModelProperty(value = "本次获取最小key")
    private String minKey;
	@ApiModelProperty(value = "本次获取最大key")
    private String maxKey;
	@ApiModelProperty(value = "参与时间")
    private Date parkTime;
	@ApiModelProperty(value = "是否中奖")
    private String isLuckly;
	@ApiModelProperty(value = "中奖号码")
    private String lucklyCode;
	@ApiModelProperty(value = "充值金额")
    private BigDecimal rechargeAmount;
	@ApiModelProperty(value = "to钱包地址")
    private String toWalletaddress;
	@ApiModelProperty(value = "from钱包地址")
    private String fromWalletaddress;
	@ApiModelProperty(value = "转帐hash")
    private String notionalpoolingHash;

    private String free1;

    private String free2;

    private String free3;

    private Integer revision;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;
    @ApiModelProperty(value = "所有key")
    private String keyArray;

    public GameKey(String id, String getType, String gameCode, String termNumber, String minKey, String maxKey, Date parkTime, String isLuckly, String lucklyCode, BigDecimal rechargeAmount, String toWalletaddress, String fromWalletaddress, String notionalpoolingHash, String free1, String free2, String free3, Integer revision, String createdBy, Date createdTime, String updatedBy, Date updatedTime) {
        this.id = id;
        this.getType = getType;
        this.gameCode = gameCode;
        this.termNumber = termNumber;
        this.minKey = minKey;
        this.maxKey = maxKey;
        this.parkTime = parkTime;
        this.isLuckly = isLuckly;
        this.lucklyCode = lucklyCode;
        this.rechargeAmount = rechargeAmount;
        this.toWalletaddress = toWalletaddress;
        this.fromWalletaddress = fromWalletaddress;
        this.notionalpoolingHash = notionalpoolingHash;
        this.free1 = free1;
        this.free2 = free2;
        this.free3 = free3;
        this.revision = revision;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public GameKey(String id, String getType, String gameCode, String termNumber, String minKey, String maxKey, Date parkTime, String isLuckly, String lucklyCode, BigDecimal rechargeAmount, String toWalletaddress, String fromWalletaddress, String notionalpoolingHash, String free1, String free2, String free3, Integer revision, String createdBy, Date createdTime, String updatedBy, Date updatedTime, String keyArray) {
        this.id = id;
        this.getType = getType;
        this.gameCode = gameCode;
        this.termNumber = termNumber;
        this.minKey = minKey;
        this.maxKey = maxKey;
        this.parkTime = parkTime;
        this.isLuckly = isLuckly;
        this.lucklyCode = lucklyCode;
        this.rechargeAmount = rechargeAmount;
        this.toWalletaddress = toWalletaddress;
        this.fromWalletaddress = fromWalletaddress;
        this.notionalpoolingHash = notionalpoolingHash;
        this.free1 = free1;
        this.free2 = free2;
        this.free3 = free3;
        this.revision = revision;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.keyArray = keyArray;
    }

    public GameKey() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGetType() {
        return getType;
    }

    public void setGetType(String getType) {
        this.getType = getType == null ? null : getType.trim();
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode == null ? null : gameCode.trim();
    }

    public String getTermNumber() {
        return termNumber;
    }

    public void setTermNumber(String termNumber) {
        this.termNumber = termNumber == null ? null : termNumber.trim();
    }

    public String getMinKey() {
        return minKey;
    }

    public void setMinKey(String minKey) {
        this.minKey = minKey == null ? null : minKey.trim();
    }

    public String getMaxKey() {
        return maxKey;
    }

    public void setMaxKey(String maxKey) {
        this.maxKey = maxKey == null ? null : maxKey.trim();
    }

    public Date getParkTime() {
        return parkTime;
    }

    public void setParkTime(Date parkTime) {
        this.parkTime = parkTime;
    }

    public String getIsLuckly() {
        return isLuckly;
    }

    public void setIsLuckly(String isLuckly) {
        this.isLuckly = isLuckly == null ? null : isLuckly.trim();
    }

    public String getLucklyCode() {
        return lucklyCode;
    }

    public void setLucklyCode(String lucklyCode) {
        this.lucklyCode = lucklyCode == null ? null : lucklyCode.trim();
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public String getToWalletaddress() {
        return toWalletaddress;
    }

    public void setToWalletaddress(String toWalletaddress) {
        this.toWalletaddress = toWalletaddress == null ? null : toWalletaddress.trim();
    }

    public String getFromWalletaddress() {
        return fromWalletaddress;
    }

    public void setFromWalletaddress(String fromWalletaddress) {
        this.fromWalletaddress = fromWalletaddress == null ? null : fromWalletaddress.trim();
    }

    public String getNotionalpoolingHash() {
        return notionalpoolingHash;
    }

    public void setNotionalpoolingHash(String notionalpoolingHash) {
        this.notionalpoolingHash = notionalpoolingHash == null ? null : notionalpoolingHash.trim();
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

    public String getKeyArray() {
        return keyArray;
    }

    public void setKeyArray(String keyArray) {
        this.keyArray = keyArray == null ? null : keyArray.trim();
    }
}