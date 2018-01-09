package com.valley.entity;

public class Picture {
	private Integer id;
	private Integer picGroID;
	private Integer picID;
	private String picNa;
	private String picUrl;
	private Integer picUserID;
	private Integer picBouUserID;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPicGroID() {
		return picGroID;
	}
	public void setPicGroID(Integer picGroID) {
		this.picGroID = picGroID;
	}
	public Integer getPicID() {
		return picID;
	}
	public void setPicID(Integer picID) {
		this.picID = picID;
	}
	public String getPicNa() {
		return picNa;
	}
	public void setPicNa(String picNa) {
		this.picNa = picNa;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public Integer getPicUserID() {
		return picUserID;
	}
	public void setPicUserID(Integer picUserID) {
		this.picUserID = picUserID;
	}
	public Integer getPicBouUserID() {
		return picBouUserID;
	}
	public void setPicBouUserID(Integer picBouUserID) {
		this.picBouUserID = picBouUserID;
	}
	@Override
	public String toString() {
		return "Picture [id=" + id + ", picGroID=" + picGroID + ", picID="
				+ picID + ", picNa=" + picNa + ", picUrl=" + picUrl
				+ ", picUserID=" + picUserID + ", picBouUserID=" + picBouUserID
				+ "]";
	}
	
	
	
}
