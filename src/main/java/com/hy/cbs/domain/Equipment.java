package com.hy.cbs.domain;

import java.util.Date;

public class Equipment {
    private Integer id;

    private Integer userId;

    private Integer carinfoId;

    private String equipment;

    private Integer able;

    private Date createDtm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCarinfoId() {
        return carinfoId;
    }

    public void setCarinfoId(Integer carinfoId) {
        this.carinfoId = carinfoId;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment == null ? null : equipment.trim();
    }

    public Integer getAble() {
        return able;
    }

    public void setAble(Integer able) {
        this.able = able;
    }

    public Date getCreateDtm() {
        return createDtm;
    }

    public void setCreateDtm(Date createDtm) {
        this.createDtm = createDtm;
    }
}