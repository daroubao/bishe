package com.valley.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.valley.dao.UserDao;
import com.valley.entity.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	public void sign_reg(User sign) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		System.out.println(session!=null);
		Transaction tx=session.beginTransaction();
		System.out.println(sign.toString());
		session.save(sign);
		tx.commit();
	}	
	

	@SuppressWarnings("unchecked")
	@Override
	public User login(User sign) {
		// TODO Auto-generated method stub
		String hql="from User where UserID=? and Password=?";
		System.out.println(sign.getUserID());
		System.out.println(sign.getPassword());
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter(0, sign.getUserID());
		query.setParameter(1, sign.getPassword());
		
		List<User> list=query.list();
		tx.commit();
		if(list!=null&&list.size()>0){
			System.out.println(list.get(0).getUserID());
			System.out.println(list.get(0).getPassword());
			return list.get(0);
		}
		return null;
	}

	/*根据id查用户个人资料*/
	@Override
	public User profilebyid(int id) {
		// TODO Auto-generated method stub
		String hql="from User where UserID=?";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter(0, id);
		User profile=(User) query.uniqueResult();
		tx.commit();
		return profile;
	}

	@Override
	public void bound(int loggedid,int userid) {
		System.out.println("test++++++++++++++++");
		System.out.println(loggedid);
		System.out.println(userid);
		String hql="update User set BoundUserID=? where UserID=?";
		String hql1="update User  set BoundUserID=? where UserID=?";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter(0, userid);
		query.setParameter(1, loggedid);
		query.executeUpdate();
		Query query1=session.createQuery(hql1);
		query1.setParameter(0, loggedid);
		query1.setParameter(1, userid);
		query1.executeUpdate();
		tx.commit();
		
	}


	@Override
	public void pro_update(String userName,String sex,String descr,int userid) {
		// TODO Auto-generated method stub
		
		String hql="update User set UserName=? ,Sex=?,descr=? where UserID=?";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter(0, userName);
		query.setParameter(1, sex);
		query.setParameter(2, descr);
		query.setParameter(3, userid);
		query.executeUpdate();
		String hql1="update Comment set ComName=? where ComUserID=?";
		Query query1=session.createQuery(hql1);
		query1.setParameter(0, userName);
		query1.setParameter(1, userid);
		query1.executeUpdate();
		tx.commit();
	}


	@Override
	public void picurl_upload(String imgurl, int userid) {
		// TODO Auto-generated method stub
		String hql="update User  set picUrl=? where userID=?";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter(0, imgurl);
		query.setParameter(1, userid);
		query.executeUpdate();
		tx.commit();
	}


	@Override
	public void unbound(int userid,int boundid) {
		// TODO Auto-generated method stub
		System.out.println(userid);
		String hql="update User  set BoundUserID=? where UserID=?";
		String hql1="update User  set BoundUserID=? where UserID=?";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter(0, userid);
		query.setParameter(1, userid);
		query.executeUpdate();
		Query query1=session.createQuery(hql);
		query1.setParameter(0, boundid);
		query1.setParameter(1, boundid);
		query1.executeUpdate();
		tx.commit();
	}
}
