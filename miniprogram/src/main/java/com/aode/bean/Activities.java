package com.aode.bean;

public class Activities {
    private Integer activityId;

    private String activityTitle;

    private String activityContent;

    private String activityBegintime;

    private String activityEndtime;

    private Integer activityIsdeleted;

    private String activityMainpicture;

    private Integer 
isTimeout;

    private Integer memberNum;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle == null ? null : activityTitle.trim();
    }

    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent == null ? null : activityContent.trim();
    }

    public String getActivityBegintime() {
        return activityBegintime;
    }

    public void setActivityBegintime(String activityBegintime) {
        this.activityBegintime = activityBegintime == null ? null : activityBegintime.trim();
    }

    public String getActivityEndtime() {
        return activityEndtime;
    }

    public void setActivityEndtime(String activityEndtime) {
        this.activityEndtime = activityEndtime == null ? null : activityEndtime.trim();
    }

    public Integer getActivityIsdeleted() {
        return activityIsdeleted;
    }

    public void setActivityIsdeleted(Integer activityIsdeleted) {
        this.activityIsdeleted = activityIsdeleted;
    }

    public String getActivityMainpicture() {
        return activityMainpicture;
    }

    public void setActivityMainpicture(String activityMainpicture) {
        this.activityMainpicture = activityMainpicture == null ? null : activityMainpicture.trim();
    }

    public Integer getisTimeout() {
        return isTimeout;
    }

    public void setisTimeout(Integer isTimeout) {
        this.isTimeout = isTimeout;
    }

    public Integer getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(Integer memberNum) {
        this.memberNum = memberNum;
    }

    public Activities(Integer activityId, String activityTitle, String activityContent, String activityBegintime, String activityEndtime, Integer activityIsdeleted, String activityMainpicture, Integer isTimeout, Integer memberNum) {
        this.activityId = activityId;
        this.activityTitle = activityTitle;
        this.activityContent = activityContent;
        this.activityBegintime = activityBegintime;
        this.activityEndtime = activityEndtime;
        this.activityIsdeleted = activityIsdeleted;
        this.activityMainpicture = activityMainpicture;
        this.isTimeout = isTimeout;
        this.memberNum = memberNum;
    }

    public Activities() {
        super();
    }
}