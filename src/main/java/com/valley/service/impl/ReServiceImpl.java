package com.valley.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valley.dao.ReDao;
import com.valley.entity.Relevance;
import com.valley.entity.User;
import com.valley.service.ReService;
@Service
public class ReServiceImpl implements ReService{

	@Autowired
	private ReDao reDao;
	@Override
	public void care_add(Relevance relevance) {
		// TODO Auto-generated method stub
		reDao.care_add(relevance);
	}

	@Override
	public List<User> care_display(int id) {
		// TODO Auto-generated method stub
		List<User> list=reDao.care_display(id);
		return list;
	}

	@Override
	public void care_del(int userid,int caredid) {
		// TODO Auto-generated method stub
	reDao.care_del(userid,caredid);	
	}

}
