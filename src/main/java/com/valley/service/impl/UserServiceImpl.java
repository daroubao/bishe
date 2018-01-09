package com.valley.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valley.dao.UserDao;
import com.valley.entity.User;
import com.valley.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao signDao;

	@Override
	public void sign_reg(User sign) {
		// TODO Auto-generated method stub
		signDao.sign_reg(sign);
	}
	
	@Override
	public User login(User sign) {
		// TODO Auto-generated method stub
		User s=signDao.login(sign);
		return s;
	}

	@Override
	public User profilebyid(int id) {
		// TODO Auto-generated method stub
		User s=signDao.profilebyid(id);
		return s;
	}

	@Override
	public void bound(int loggedid, int userid) {
		// TODO Auto-generated method stub
		signDao.bound(loggedid, userid);
		
	}

	@Override
	public void pro_update(String userName,String sex,String descr,int userid) {
		// TODO Auto-generated method stub
		signDao.pro_update(userName, sex, descr, userid);
	}

	@Override
	public void unbound(int userid,int boundid) {
		// TODO Auto-generated method stub
		signDao.unbound(userid,boundid);
	}

	
}
