package com.valley.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valley.dao.FestivalDao;
import com.valley.entity.Festival;
import com.valley.entity.Note;
import com.valley.service.FestivalService;
@Service
public class FestivalServiceImpl implements FestivalService{
	@Autowired
	private FestivalDao festivalDao;
	@Override
	public void fes_add(Festival festival) {
		// TODO Auto-generated method stub
		festivalDao.fes_add(festival);
	}

	@Override
	public List<Festival> fes_display(int id) {
		// TODO Auto-generated method stub
		List<Festival> list=festivalDao.fes_display(id);
		return list;
	}

	@Override
	public void fes_del(int id) {
		// TODO Auto-generated method stub
		festivalDao.fes_del(id);
	}

	@Override
	public void fes_update(int id) {
		// TODO Auto-generated method stub
		festivalDao.fes_update(id);
	}

}
