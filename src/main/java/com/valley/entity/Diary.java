package com.valley.entity;

import java.util.Date;

public class Diary {
	private Integer id;
	private Integer diaryID;
	private Date dateline;
	private Integer diaUserID;
	private Integer support;
	private String rights;//权限
	private String title;
	private String body;
	private String stage;//情感阶段
	private String picUrl;
	private String userName;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDiaryID() {
		return diaryID;
	}
	public void setDiaryID(Integer diaryID) {
		this.diaryID = diaryID;
	}
	public Date getDateline() {
		return dateline;
	}
	public void setDateline(Date dateline) {
		this.dateline = dateline;
	}
	public Integer getDiaUserID() {
		return diaUserID;
	}
	public void setDiaUserID(Integer diaUserID) {
		this.diaUserID = diaUserID;
	}
	public Integer getSupport() {
		return support;
	}
	public void setSupport(Integer support) {
		this.support = support;
	}
	public String getRights() {
		return rights;
	}
	public void setRights(String rights) {
		this.rights = rights;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	@Override
	public String toString() {
		return "Diary [id=" + id + ", diaryID=" + diaryID + ", dateline="
				+ dateline + ", diaUserID=" + diaUserID + ", support="
				+ support + ", rights=" + rights + ", title=" + title
				+ ", body=" + body + ", stage=" + stage + ", picUrl=" + picUrl
				+ "]";
	}

	
	
	
	
	
}
