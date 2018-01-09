package com.valley.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;






import com.valley.dao.DiaryDao;
import com.valley.entity.Diary;

@Repository
public class DiaryDaoImpl implements DiaryDao{
	
	@Resource
	private SessionFactory sessionFactory;

	@Override
	public void diary_add(Diary diary) {
		// TODO Auto-generated method stub
		System.out.println("日记添加执行");
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.save(diary);
		tx.commit();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Diary> diary1_dis(int UserID) {
		// TODO Auto-generated method stub
		String hql="select * from diary where DiaUserID=? and Rights=1";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query1=session.createSQLQuery(hql).addEntity(Diary.class);
		query1.setParameter(0, UserID);
		List<Diary> list=query1.list();
		tx.commit();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Diary> diary2_dis(int UserID,int bid) {
		// TODO Auto-generated method stub
		System.out.println("dao获取的UserID为"+UserID);
		String hql="select * from diary where Rights=2 and DiaUserID=? or DiaUserID=? ORDER BY Dateline DESC";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query2=session.createSQLQuery(hql).addEntity(Diary.class);
		query2.setParameter(0, UserID);
		query2.setParameter(1, bid);
		List<Diary> list=query2.list();
		tx.commit();
		return list;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Diary> diary2_dishot(int UserID) {
		// TODO Auto-generated method stub
		System.out.println("dao获取的UserID为"+UserID);
		String hql="select * from diary where DiaUserID=? and Rights=2 ORDER BY Dateline DESC";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query2=session.createSQLQuery(hql).addEntity(Diary.class);
		query2.setParameter(0, UserID);
		List<Diary> list=query2.list();
		tx.commit();
		return list;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Diary> diaryall_dis() {
		// TODO Auto-generated method stub
		String hql="from Diary where rights=3";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		List<Diary> list=query.list();
		tx.commit();
		return list;
	}

	@Override
	public Diary diary(int diaryid) {
		// TODO Auto-generated method stub
		String hql="from Diary where Id=?";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setInteger(0,diaryid);
		Diary diary=(Diary) query.uniqueResult();
		tx.commit();
		return diary;
	}

	@Override
	public void diary_del(int diaryid) {
		// TODO Auto-generated method stub
		System.out.println("DAO层获取的id为："+diaryid);
		String hql="Delete From Diary where Id=?";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setInteger(0,diaryid);
		query.executeUpdate();
		tx.commit();
	}

	

}
