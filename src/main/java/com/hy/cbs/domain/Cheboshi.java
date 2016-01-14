package com.hy.cbs.domain;

import java.util.Date;

public class Cheboshi {
    private Integer id;

    private String username;

    private String password;

    private String nickName;

    private String realName;

    private Integer sex;

    private String imgUrl;

    private String phone;

    private String weixinNum;

    private String idCard;

    private Integer technologyLevel;

    private String technologyRemark;

    private Integer experienceYear;

    private String recommendCode;

    private String token;

    private Date createDtm;

    private Integer isPass;

    private Date passDtm;

    private String selfIntroduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getWeixinNum() {
        return weixinNum;
    }

    public void setWeixinNum(String weixinNum) {
        this.weixinNum = weixinNum == null ? null : weixinNum.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getTechnologyLevel() {
        return technologyLevel;
    }

    public void setTechnologyLevel(Integer technologyLevel) {
        this.technologyLevel = technologyLevel;
    }

    public String getTechnologyRemark() {
        return technologyRemark;
    }

    public void setTechnologyRemark(String technologyRemark) {
        this.technologyRemark = technologyRemark == null ? null : technologyRemark.trim();
    }

    public Integer getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(Integer experienceYear) {
        this.experienceYear = experienceYear;
    }

    public String getRecommendCode() {
        return recommendCode;
    }

    public void setRecommendCode(String recommendCode) {
        this.recommendCode = recommendCode == null ? null : recommendCode.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getCreateDtm() {
        return createDtm;
    }

    public void setCreateDtm(Date createDtm) {
        this.createDtm = createDtm;
    }

    public Integer getIsPass() {
        return isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    public Date getPassDtm() {
        return passDtm;
    }

    public void setPassDtm(Date passDtm) {
        this.passDtm = passDtm;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction == null ? null : selfIntroduction.trim();
    }
}