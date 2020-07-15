package com.aode.bean;

import java.util.Date;

public class Comment {
    private Integer commentId;

    private String commentContent;

    private Date commentPosttime;

    private Integer commentOwnerid;

    private Integer commentNum;

    private Integer commentUserid;

    private Integer commentState;

    private String commentUsernname;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Date getCommentPosttime() {
        return commentPosttime;
    }

    public void setCommentPosttime(Date commentPosttime) {
        this.commentPosttime = commentPosttime;
    }

    public Integer getCommentOwnerid() {
        return commentOwnerid;
    }

    public void setCommentOwnerid(Integer commentOwnerid) {
        this.commentOwnerid = commentOwnerid;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getCommentUserid() {
        return commentUserid;
    }

    public void setCommentUserid(Integer commentUserid) {
        this.commentUserid = commentUserid;
    }

    public Integer getCommentState() {
        return commentState;
    }

    public void setCommentState(Integer commentState) {
        this.commentState = commentState;
    }

    public String getCommentUsernname() {
        return commentUsernname;
    }

    public void setCommentUsernname(String commentUsernname) {
        this.commentUsernname = commentUsernname == null ? null : commentUsernname.trim();
    }

    public Comment(Integer commentId, String commentContent, Date commentPosttime, Integer commentOwnerid, Integer commentNum, Integer commentUserid, Integer commentState, String commentUsernname) {
        this.commentId = commentId;
        this.commentContent = commentContent;
        this.commentPosttime = commentPosttime;
        this.commentOwnerid = commentOwnerid;
        this.commentNum = commentNum;
        this.commentUserid = commentUserid;
        this.commentState = commentState;
        this.commentUsernname = commentUsernname;
    }

    public Comment() {
        super();
    }
}