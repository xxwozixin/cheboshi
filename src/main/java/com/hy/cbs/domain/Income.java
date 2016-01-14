package com.hy.cbs.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Income {
    private Integer id;

    private Integer walletId;

    private BigDecimal money;

    private Integer type;

    private Date gainDtm;

    private Integer cheboshiId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWalletId() {
        return walletId;
    }

    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getGainDtm() {
        return gainDtm;
    }

    public void setGainDtm(Date gainDtm) {
        this.gainDtm = gainDtm;
    }

    public Integer getCheboshiId() {
        return cheboshiId;
    }

    public void setCheboshiId(Integer cheboshiId) {
        this.cheboshiId = cheboshiId;
    }
}