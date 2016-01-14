package com.hy.cbs.domain;

import java.util.Date;

public class Blacklist {
    private Integer id;

    private Integer type;

    private Integer joinId;

    private Date createDtm;

    private Date endDtm;

    private Integer status;

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

    public Date getCreateDtm() {
        return createDtm;
    }

    public void setCreateDtm(Date createDtm) {
        this.createDtm = createDtm;
    }

    public Date getEndDtm() {
        return endDtm;
    }

    public void setEndDtm(Date endDtm) {
        this.endDtm = endDtm;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}