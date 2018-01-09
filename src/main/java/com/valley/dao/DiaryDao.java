package com.valley.dao;

import java.util.List;

import com.valley.entity.Diary;

public interface DiaryDao {
	
	public void diary_add(Diary diary);
	
	public List<Diary> diary1_dis(int UserID);
	
	public List<Diary> diary2_dis(int UserID,int bid);
	
	public List<Diary> diary2_dishot(int UserID);
	
	public List<Diary> diaryall_dis();
	
	public Diary diary(int diaryid);
	
	public void diary_del(int diaryid);

}
