package com.aode.bean;

import java.util.Date;

public class Message {
    private Integer messageId;

    private String messageContent;

    private Date messageTime;

    private Integer uId;

    private Integer adminId;

    private Integer aId;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    public Date getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Message(Integer messageId, String messageContent, Date messageTime, Integer uId, Integer adminId, Integer aId) {
        this.messageId = messageId;
        this.messageContent = messageContent;
        this.messageTime = messageTime;
        this.uId = uId;
        this.adminId = adminId;
        this.aId = aId;
    }

    public Message() {
        super();
    }
}