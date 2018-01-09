package com.valley.service;

import com.valley.entity.User;

public interface UserService {
	public User login(User sign);
	public void sign_reg(User sign);
	public User profilebyid(int id);
	public void bound(int loggedid,int userid);
	public void pro_update(String userName,String sex,String descr,int userid);
	public void unbound(int userid,int boundid);
}
