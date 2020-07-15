package com.aode.bean;

public class Admin {
    private Integer adminId;

    private String adminName;

    private String adminYear;

    private String adminDepart;

    private String adminPhone;

    private String adminPassword;

    private String adminTime;

    private String adminState;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminYear() {
        return adminYear;
    }

    public void setAdminYear(String adminYear) {
        this.adminYear = adminYear == null ? null : adminYear.trim();
    }

    public String getAdminDepart() {
        return adminDepart;
    }

    public void setAdminDepart(String adminDepart) {
        this.adminDepart = adminDepart == null ? null : adminDepart.trim();
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminTime() {
        return adminTime;
    }

    public void setAdminTime(String adminTime) {
        this.adminTime = adminTime == null ? null : adminTime.trim();
    }

    public String getAdminState() {
        return adminState;
    }

    public void setAdminState(String adminState) {
        this.adminState = adminState == null ? null : adminState.trim();
    }

    public Admin(Integer adminId, String adminName, String adminYear, String adminDepart, String adminPhone, String adminPassword, String adminTime, String adminState) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminYear = adminYear;
        this.adminDepart = adminDepart;
        this.adminPhone = adminPhone;
        this.adminPassword = adminPassword;
        this.adminTime = adminTime;
        this.adminState = adminState;
    }

    public Admin() {
        super();
    }
}