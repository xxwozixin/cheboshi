package com.hy.cbs.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Withdraw {
    private Integer id;

    private Integer type;

    private Integer joinId;

    private BigDecimal money;

    private Integer status;

    private String handleText;

    private Date createDtm;

    private Date handleDtm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getJoinId() {
        return joinId;
    }

    public void setJoinId(Integer joinId) {
        this.joinId = joinId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getHandleText() {
        return handleText;
    }

    public void setHandleText(String handleText) {
        this.handleText = handleText == null ? null : handleText.trim();
    }

    public Date getCreateDtm() {
        return createDtm;
    }

    public void setCreateDtm(Date createDtm) {
        this.createDtm = createDtm;
    }

    public Date getHandleDtm() {
        return handleDtm;
    }

    public void setHandleDtm(Date handleDtm) {
        this.handleDtm = handleDtm;
    }
}