package com.valley.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valley.dao.DiaryDao;
import com.valley.entity.Diary;
import com.valley.service.DiaryService;

@Service
public class DiaryServiceImpl implements DiaryService{

	@Autowired
	private DiaryDao diaryDao;
	
	@Override
	public void diary_add(Diary diary) {
		// TODO Auto-generated method stub
		diaryDao.diary_add(diary);
	}

	@Override
	public List<Diary> diary1_dis(int UserID) {
		// TODO Auto-generated method stub
		List<Diary> list=diaryDao.diary1_dis(UserID);
		return list;
	}

	@Override
	public List<Diary> diary2_dis(int UserID,int bid) {
		// TODO Auto-generated method stub
		List<Diary> list=diaryDao.diary2_dis(UserID,bid);
		return list;
	}
	
	@Override
	public List<Diary> diary2_dishot(int UserID) {
		// TODO Auto-generated method stub
		List<Diary> list=diaryDao.diary2_dishot(UserID);
		return list;
	}

	@Override
	public List<Diary> diaryall_dis() {
		// TODO Auto-generated method stub
		List<Diary> list=diaryDao.diaryall_dis();
		return list;
	}

	@Override
	public Diary diary(int diaryid) {
		// TODO Auto-generated method stub
		Diary d=diaryDao.diary(diaryid);
		return d;
	}

	@Override
	public void diary_del(int diaryid) {
		// TODO Auto-generated method stub
		diaryDao.diary_del(diaryid);
	}

}
