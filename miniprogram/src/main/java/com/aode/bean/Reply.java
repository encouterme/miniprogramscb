package com.aode.bean;

import java.util.Date;

public class Reply {
    private Integer replyId;

    private Date replyPosttime;

    private String replyContent;

    private Integer replyUserid;

    private Integer replyCommentid;

    private Integer replyState;

    private Integer replyForUserid;

    private String replyForUsername;

    private String replyUsername;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Date getReplyPosttime() {
        return replyPosttime;
    }

    public void setReplyPosttime(Date replyPosttime) {
        this.replyPosttime = replyPosttime;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    public Integer getReplyUserid() {
        return replyUserid;
    }

    public void setReplyUserid(Integer replyUserid) {
        this.replyUserid = replyUserid;
    }

    public Integer getReplyCommentid() {
        return replyCommentid;
    }

    public void setReplyCommentid(Integer replyCommentid) {
        this.replyCommentid = replyCommentid;
    }

    public Integer getReplyState() {
        return replyState;
    }

    public void setReplyState(Integer replyState) {
        this.replyState = replyState;
    }

    public Integer getReplyForUserid() {
        return replyForUserid;
    }

    public void setReplyForUserid(Integer replyForUserid) {
        this.replyForUserid = replyForUserid;
    }

    public String getReplyForUsername() {
        return replyForUsername;
    }

    public void setReplyForUsername(String replyForUsername) {
        this.replyForUsername = replyForUsername == null ? null : replyForUsername.trim();
    }

    public String getReplyUsername() {
        return replyUsername;
    }

    public void setReplyUsername(String replyUsername) {
        this.replyUsername = replyUsername == null ? null : replyUsername.trim();
    }

    public Reply(Integer replyId, Date replyPosttime, String replyContent, Integer replyUserid, Integer replyCommentid, Integer replyState, Integer replyForUserid, String replyForUsername, String replyUsername) {
        this.replyId = replyId;
        this.replyPosttime = replyPosttime;
        this.replyContent = replyContent;
        this.replyUserid = replyUserid;
        this.replyCommentid = replyCommentid;
        this.replyState = replyState;
        this.replyForUserid = replyForUserid;
        this.replyForUsername = replyForUsername;
        this.replyUsername = replyUsername;
    }

    public Reply() {
        super();
    }
}