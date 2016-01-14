package com.hy.cbs.domain;

import java.util.Date;

public class Carinfo {
    private Integer id;

    private Integer brandId;

    private String brand;

    private Integer modelId;

    private String model;

    private String licencePlate;

    private String carframeNum;

    private String engineNum;

    private Date insuranceEndTime;

    private Date verificationNextTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate == null ? null : licencePlate.trim();
    }

    public String getCarframeNum() {
        return carframeNum;
    }

    public void setCarframeNum(String carframeNum) {
        this.carframeNum = carframeNum == null ? null : carframeNum.trim();
    }

    public String getEngineNum() {
        return engineNum;
    }

    public void setEngineNum(String engineNum) {
        this.engineNum = engineNum == null ? null : engineNum.trim();
    }

    public Date getInsuranceEndTime() {
        return insuranceEndTime;
    }

    public void setInsuranceEndTime(Date insuranceEndTime) {
        this.insuranceEndTime = insuranceEndTime;
    }

    public Date getVerificationNextTime() {
        return verificationNextTime;
    }

    public void setVerificationNextTime(Date verificationNextTime) {
        this.verificationNextTime = verificationNextTime;
    }
}