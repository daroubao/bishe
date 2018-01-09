package com.valley.entity;

import java.util.Date;

public class Album {
	private Integer id;
	private Integer albumID;
	private String albGroupNa;
	private Integer albUserID;
	private Integer albBouUserID;
	private String place;
	private Date albDate;
	private String albDesc;
	private String albRights;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAlbumID() {
		return albumID;
	}
	public void setAlbumID(Integer albumID) {
		this.albumID = albumID;
	}
	public String getAlbGroupNa() {
		return albGroupNa;
	}
	public void setAlbGroupNa(String albGroupNa) {
		this.albGroupNa = albGroupNa;
	}
	public Integer getAlbUserID() {
		return albUserID;
	}
	public void setAlbUserID(Integer albUserID) {
		this.albUserID = albUserID;
	}
	public Integer getAlbBouUserID() {
		return albBouUserID;
	}
	public void setAlbBouUserID(Integer albBouUserID) {
		this.albBouUserID = albBouUserID;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Date getAlbDate() {
		return albDate;
	}
	public void setAlbDate(Date albDate) {
		this.albDate = albDate;
	}
	public String getAlbDesc() {
		return albDesc;
	}
	public void setAlbDesc(String albDesc) {
		this.albDesc = albDesc;
	}
	public String getAlbRights() {
		return albRights;
	}
	public void setAlbRights(String albRights) {
		this.albRights = albRights;
	}
	
	

}
