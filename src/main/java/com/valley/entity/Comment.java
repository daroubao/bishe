package com.valley.entity;

import java.util.Date;

public class Comment {
	private Integer id;
	private Integer commentID;
	private Integer comUserID;
	private String comName;
	private String comDesc;
	private Date comTime;
	private Integer comDiaryID;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCommentID() {
		return commentID;
	}
	public void setCommentID(Integer commentID) {
		this.commentID = commentID;
	}
	public Integer getComUserID() {
		return comUserID;
	}
	public void setComUserID(Integer comUserID) {
		this.comUserID = comUserID;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getComDesc() {
		return comDesc;
	}
	public void setComDesc(String comDesc) {
		this.comDesc = comDesc;
	}
	public Date getComTime() {
		return comTime;
	}
	public void setComTime(Date comTime) {
		this.comTime = comTime;
	}
	public Integer getComDiaryID() {
		return comDiaryID;
	}
	public void setComDiaryID(Integer comDiaryID) {
		this.comDiaryID = comDiaryID;
	}
	
	
}
