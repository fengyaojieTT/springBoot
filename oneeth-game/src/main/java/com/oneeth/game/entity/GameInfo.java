package com.oneeth.game.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GameInfo {
    private String id;

    private String gameCode;

    private BigDecimal minimumMoney;

    private String defaultCode;

    private String gameContract;

    private String ownerPrivateKey;

    private String gameType;

    private BigDecimal endPoint;

    private String free1;

    private String free2;

    private String free3;

    private Integer revision;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public GameInfo(String id, String gameCode, BigDecimal minimumMoney, String defaultCode, String gameContract, String ownerPrivateKey, String gameType, BigDecimal endPoint, String free1, String free2, String free3, Integer revision, String createdBy, Date createdTime, String updatedBy, Date updatedTime) {
        this.id = id;
        this.gameCode = gameCode;
        this.minimumMoney = minimumMoney;
        this.defaultCode = defaultCode;
        this.gameContract = gameContract;
        this.ownerPrivateKey = ownerPrivateKey;
        this.gameType = gameType;
        this.endPoint = endPoint;
        this.free1 = free1;
        this.free2 = free2;
        this.free3 = free3;
        this.revision = revision;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
    }

    public GameInfo() {
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
        this.defaultCode = defaultCode == null ? null : defaultCode.trim();
    }

    public String getGameContract() {
        return gameContract;
    }

    public void setGameContract(String gameContract) {
        this.gameContract = gameContract == null ? null : gameContract.trim();
    }

    public String getOwnerPrivateKey() {
        return ownerPrivateKey;
    }

    public void setOwnerPrivateKey(String ownerPrivateKey) {
        this.ownerPrivateKey = ownerPrivateKey == null ? null : ownerPrivateKey.trim();
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType == null ? null : gameType.trim();
    }

    public BigDecimal getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(BigDecimal endPoint) {
        this.endPoint = endPoint;
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