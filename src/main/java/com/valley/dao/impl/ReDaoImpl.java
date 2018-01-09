package com.valley.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.valley.dao.ReDao;
import com.valley.dao.UserDao;
import com.valley.entity.Diary;
import com.valley.entity.Relevance;
import com.valley.entity.User;
@Repository
public class ReDaoImpl implements ReDao{
	@Resource
	private SessionFactory sessionFactory;

	@Override
	public void care_add(Relevance relevance) {
		// TODO Auto-generated method stub
		System.out.println("关注执行");
		Session session=sessionFactory.getCurrentSession();
		System.out.println(session!=null);
		Transaction tx=session.beginTransaction();
		session.save(relevance);
		tx.commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> care_display(int id) {
		// TODO Auto-generated method stub
		System.out.println("所有关注展示执行");
		String hql1="From Relevance Where careUserID=?";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query1=session.createQuery(hql1);
		query1.setParameter(0, id);
		List<Relevance> list=query1.list();
		List<User> list1=new ArrayList<User>();
		for(int i=0;i<list.size();i++){
			String hql="from User where userID ="+list.get(i).getCaredUserId();
			Query query=session.createQuery(hql);
			
				list1.add((User) query.uniqueResult());	
		}
		System.out.println(list1.get(0).toString());
		tx.commit();
		return list1;
	}

	@Override
	public void care_del(int userid,int caredid) {
		// TODO Auto-generated method stub
		String hql="delete from Relevance where careUserID=? and caredUserID=?";
		Session session=sessionFactory.openSession();
		Query query=session.createQuery(hql);
		query.setParameter(0, userid);
		query.setParameter(1, caredid);
		query.executeUpdate();
		session.beginTransaction().commit();
	}
}
