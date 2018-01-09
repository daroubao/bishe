package com.valley.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.valley.dao.FestivalDao;
import com.valley.entity.Festival;

@Repository
public class FestivalDaoImpl implements FestivalDao{
	@Resource
	private SessionFactory sessionFactory;
	@Override
	public void fes_add(Festival festival) {
		// TODO Auto-generated method stub
		System.out.println("纪念日添加执行");
		
		Session session=sessionFactory.getCurrentSession();
		System.out.println(session!=null);
		Transaction tx=session.beginTransaction();
		session.save(festival);
		
		tx.commit();
	}

	@Override
	public List<Festival> fes_display(int id) {
		// TODO Auto-generated method stub
		System.out.println("纪念日展示执行");
		String hql="from Festival where fesUserID=? Order By FesDate desc";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter(0, id);
		List<Festival> list=query.list();
		tx.commit();
		return list;
	}

	@Override
	public void fes_del(int id) {
		// TODO Auto-generated method stub
		String hql="delete from Festival where id=?";
		//Session session=sessionFactory.getCurrentSession();
		Session session=sessionFactory.openSession();
		Query query=session.createQuery(hql);
		query.setInteger(0,id);
		query.executeUpdate();
		session.beginTransaction().commit();
	}

	@Override
	public void fes_update(int id) {
		// TODO Auto-generated method stub
		
	}

}
