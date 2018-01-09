package com.valley.dao;

import java.util.List;

import com.valley.entity.Note;

public interface NoteDao {
	public void note_add(Note note);
	
	public List<Note> note_display(int id);
	
	public void note_del(int id);
	
}
