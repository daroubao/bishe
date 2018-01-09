package com.valley.entity;

import java.util.Date;

public class Festival {
	private Integer id;
	private Integer fesID;
	private String fesTitle;
	private Date fesDate;
	private Date remindDate;
	private String fesDesc;
	private Integer fesUserID;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFesID() {
		return fesID;
	}
	public void setFesID(Integer fesID) {
		this.fesID = fesID;
	}
	public String getFesTitle() {
		return fesTitle;
	}
	public void setFesTitle(String fesTitle) {
		this.fesTitle = fesTitle;
	}
	
	public Date getRemindDate() {
		return remindDate;
	}
	public void setRemindDate(Date remindDate) {
		this.remindDate = remindDate;
	}
	public String getFesDesc() {
		return fesDesc;
	}
	public void setFesDesc(String fesDesc) {
		this.fesDesc = fesDesc;
	}
	public Integer getFesUserID() {
		return fesUserID;
	}
	public void setFesUserID(Integer fesUserID) {
		this.fesUserID = fesUserID;
	}
	public Date getFesDate() {
		return fesDate;
	}
	public void setFesDate(Date fesDate) {
		this.fesDate = fesDate;
	}
}
