package com.hy.cbs.domain;

import java.util.Date;

public class Qualification {
    private Integer id;

    private Integer cheboshiId;

    private String idCard;

    private String idCardImgA;

    private String idCardImgB;

    private String engineerProveImg;

    private String factoryProveImg;

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

    public Integer getCheboshiId() {
        return cheboshiId;
    }

    public void setCheboshiId(Integer cheboshiId) {
        this.cheboshiId = cheboshiId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getIdCardImgA() {
        return idCardImgA;
    }

    public void setIdCardImgA(String idCardImgA) {
        this.idCardImgA = idCardImgA == null ? null : idCardImgA.trim();
    }

    public String getIdCardImgB() {
        return idCardImgB;
    }

    public void setIdCardImgB(String idCardImgB) {
        this.idCardImgB = idCardImgB == null ? null : idCardImgB.trim();
    }

    public String getEngineerProveImg() {
        return engineerProveImg;
    }

    public void setEngineerProveImg(String engineerProveImg) {
        this.engineerProveImg = engineerProveImg == null ? null : engineerProveImg.trim();
    }

    public String getFactoryProveImg() {
        return factoryProveImg;
    }

    public void setFactoryProveImg(String factoryProveImg) {
        this.factoryProveImg = factoryProveImg == null ? null : factoryProveImg.trim();
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