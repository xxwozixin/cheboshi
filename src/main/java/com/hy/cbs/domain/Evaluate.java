package com.hy.cbs.domain;

import java.util.Date;

public class Evaluate {
    private Integer id;

    private Integer type;

    private Integer joinId;

    private Integer majorLevel;

    private Integer attitudeLevel;

    private Date createDtm;

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

    public Integer getMajorLevel() {
        return majorLevel;
    }

    public void setMajorLevel(Integer majorLevel) {
        this.majorLevel = majorLevel;
    }

    public Integer getAttitudeLevel() {
        return attitudeLevel;
    }

    public void setAttitudeLevel(Integer attitudeLevel) {
        this.attitudeLevel = attitudeLevel;
    }

    public Date getCreateDtm() {
        return createDtm;
    }

    public void setCreateDtm(Date createDtm) {
        this.createDtm = createDtm;
    }
}