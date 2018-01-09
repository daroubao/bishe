package com.valley.entity;

import java.util.Date;

public class Note {
	private Integer id;
	private Integer noteID;
	private String noteTitle;
	private String noteDesc;
	private Date noteDate;
	private Integer noteUserID;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNoteID() {
		return noteID;
	}
	public void setNoteID(Integer noteID) {
		this.noteID = noteID;
	}
	public String getNoteTitle() {
		return noteTitle;
	}
	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
	public String getNoteDesc() {
		return noteDesc;
	}
	public void setNoteDesc(String noteDesc) {
		this.noteDesc = noteDesc;
	}
	public Date getNoteDate() {
		return noteDate;
	}
	public void setNoteDate(Date noteDate) {
		this.noteDate = noteDate;
	}
	public Integer getNoteUserID() {
		return noteUserID;
	}
	public void setNoteUserID(Integer noteUserID) {
		this.noteUserID = noteUserID;
	}
	@Override
	public String toString() {
		return "Note [id=" + id + ", noteID=" + noteID + ", noteTitle="
				+ noteTitle + ", noteDesc=" + noteDesc + ", noteDate="
				+ noteDate + ", noteUserID=" + noteUserID + "]";
	}
	
	
	
}
