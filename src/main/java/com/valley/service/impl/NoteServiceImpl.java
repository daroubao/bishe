package com.valley.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valley.dao.NoteDao;
import com.valley.entity.Note;
import com.valley.service.NoteService;

@Service
public class NoteServiceImpl implements NoteService{
	@Autowired
	private NoteDao noteDao;
	
	@Override
	public void note_add(Note note) {
		// TODO Auto-generated method stub
		noteDao.note_add(note);
	}

	@Override
	public List<Note> note_display(int id) {
		// TODO Auto-generated method stub
		List<Note> list=noteDao.note_display(id);
		return list;
		
	}

	@Override
	public void note_del(int id) {
		// TODO Auto-generated method stub
		noteDao.note_del(id);
		
		
		
		
	}
}
