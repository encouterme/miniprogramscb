package com.aode.bean;

public class Department {
    private Integer departmentId;

    private String departmentName;

    private String departmentIntroduce;

    private String departmentImage;

    private String leaderName;

    private String leaderQq;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentIntroduce() {
        return departmentIntroduce;
    }

    public void setDepartmentIntroduce(String departmentIntroduce) {
        this.departmentIntroduce = departmentIntroduce == null ? null : departmentIntroduce.trim();
    }

    public String getDepartmentImage() {
        return departmentImage;
    }

    public void setDepartmentImage(String departmentImage) {
        this.departmentImage = departmentImage == null ? null : departmentImage.trim();
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName == null ? null : leaderName.trim();
    }

    public String getLeaderQq() {
        return leaderQq;
    }

    public void setLeaderQq(String leaderQq) {
        this.leaderQq = leaderQq == null ? null : leaderQq.trim();
    }

    public Department(Integer departmentId, String departmentName, String departmentIntroduce, String departmentImage, String leaderName, String leaderQq) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentIntroduce = departmentIntroduce;
        this.departmentImage = departmentImage;
        this.leaderName = leaderName;
        this.leaderQq = leaderQq;
    }

    public Department() {
        super();
    }
}