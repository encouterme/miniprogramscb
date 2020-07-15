package com.aode.bean;

import java.util.Date;

public class Annc {
    private Integer anncId;

    private String anncTitle;

    private String anncContent;

    private Date anncTime;

    private String anncMenber;

    private String anncImg01;

    private String anncImg02;

    private String anncImg03;

    public Integer getAnncId() {
        return anncId;
    }

    public void setAnncId(Integer anncId) {
        this.anncId = anncId;
    }

    public String getAnncTitle() {
        return anncTitle;
    }

    public void setAnncTitle(String anncTitle) {
        this.anncTitle = anncTitle == null ? null : anncTitle.trim();
    }

    public String getAnncContent() {
        return anncContent;
    }

    public void setAnncContent(String anncContent) {
        this.anncContent = anncContent == null ? null : anncContent.trim();
    }

    public Date getAnncTime() {
        return anncTime;
    }

    public void setAnncTime(Date anncTime) {
        this.anncTime = anncTime;
    }

    public String getAnncMenber() {
        return anncMenber;
    }

    public void setAnncMenber(String anncMenber) {
        this.anncMenber = anncMenber == null ? null : anncMenber.trim();
    }

    public String getAnncImg01() {
        return anncImg01;
    }

    public void setAnncImg01(String anncImg01) {
        this.anncImg01 = anncImg01 == null ? null : anncImg01.trim();
    }

    public String getAnncImg02() {
        return anncImg02;
    }

    public void setAnncImg02(String anncImg02) {
        this.anncImg02 = anncImg02 == null ? null : anncImg02.trim();
    }

    public String getAnncImg03() {
        return anncImg03;
    }

    public void setAnncImg03(String anncImg03) {
        this.anncImg03 = anncImg03 == null ? null : anncImg03.trim();
    }

    public Annc(Integer anncId, String anncTitle, String anncContent, Date anncTime, String anncMenber, String anncImg01, String anncImg02, String anncImg03) {
        this.anncId = anncId;
        this.anncTitle = anncTitle;
        this.anncContent = anncContent;
        this.anncTime = anncTime;
        this.anncMenber = anncMenber;
        this.anncImg01 = anncImg01;
        this.anncImg02 = anncImg02;
        this.anncImg03 = anncImg03;
    }

    public Annc() {
        super();
    }
}