package com.hy.cbs.domain;

import java.util.Date;

public class QuestionMsg {
    private Integer id;

    private Integer cheboshiId;

    private Integer questionId;

    private String content;

    private Integer isAccept;

    private Date createDtm;

    private Integer isDisplay;

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

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(Integer isAccept) {
        this.isAccept = isAccept;
    }

    public Date getCreateDtm() {
        return createDtm;
    }

    public void setCreateDtm(Date createDtm) {
        this.createDtm = createDtm;
    }

    public Integer getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
    }
}