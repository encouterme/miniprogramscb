package com.aode.bean;

public class Image {
    private Integer imageId;

    private Integer activityId;

    private String imageSrc;

    private Integer imageIsdeleted;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc == null ? null : imageSrc.trim();
    }

    public Integer getImageIsdeleted() {
        return imageIsdeleted;
    }

    public void setImageIsdeleted(Integer imageIsdeleted) {
        this.imageIsdeleted = imageIsdeleted;
    }

    public Image(Integer imageId, Integer activityId, String imageSrc, Integer imageIsdeleted) {
        this.imageId = imageId;
        this.activityId = activityId;
        this.imageSrc = imageSrc;
        this.imageIsdeleted = imageIsdeleted;
    }

    public Image() {
        super();
    }
}