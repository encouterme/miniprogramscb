package com.aode.bean;

public class Registration {
    private Integer userId;

    private String userUsername;

    private Integer userGrade;

    private String userDepartment;

    private String userMajor;

    private String userPhonenum;

    private String userEmail;

    private String activityId;

    private Integer 
isPass;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername == null ? null : userUsername.trim();
    }

    public Integer getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(Integer userGrade) {
        this.userGrade = userGrade;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment == null ? null : userDepartment.trim();
    }

    public String getUserMajor() {
        return userMajor;
    }

    public void setUserMajor(String userMajor) {
        this.userMajor = userMajor == null ? null : userMajor.trim();
    }

    public String getUserPhonenum() {
        return userPhonenum;
    }

    public void setUserPhonenum(String userPhonenum) {
        this.userPhonenum = userPhonenum == null ? null : userPhonenum.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    public Integer getisPass() {
        return isPass;
    }

    public void setisPass(Integer isPass) {
        this.isPass = isPass;
    }

    public Registration(Integer userId, String userUsername, Integer userGrade, String userDepartment, String userMajor, String userPhonenum, String userEmail, String activityId, Integer isPass) {
        this.userId = userId;
        this.userUsername = userUsername;
        this.userGrade = userGrade;
        this.userDepartment = userDepartment;
        this.userMajor = userMajor;
        this.userPhonenum = userPhonenum;
        this.userEmail = userEmail;
        this.activityId = activityId;
        this.isPass = isPass;
    }

    public Registration() {
        super();
    }
}