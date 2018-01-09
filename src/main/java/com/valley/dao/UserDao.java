package com.valley.dao;

import com.valley.entity.User;


public interface UserDao {
	
	public User login(User sign);

	public void sign_reg(User sign);
	
	public User profilebyid(int id);
	
	public void bound(int loggedid,int userid);
	
	public void pro_update(String userName,String sex,String descr,int userid); 
	
	public void picurl_upload(String imgurl, int userid);
	
	public void unbound(int userid,int boundid);

}
