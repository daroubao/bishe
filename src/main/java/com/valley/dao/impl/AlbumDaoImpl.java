package com.valley.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import com.valley.dao.AlbumDao;
import com.valley.entity.Album;


@Repository
public class AlbumDaoImpl implements AlbumDao{
	@Resource
	private SessionFactory sessionFactory;

	@Override
	public void album_add(Album album) {
		// TODO Auto-generated method stub
		System.out.println("相册添加执行");
		Session session=sessionFactory.getCurrentSession();
		System.out.println(session!=null);
		Transaction tx=session.beginTransaction();
		session.save(album);
		tx.commit();
	}

	@Override
	public List<Album> album_display(int id,int boundid) {
		// TODO Auto-generated method stub
		System.out.println("相册展示执行；用户id为："+id+"绑定的id为"+boundid);
		String hql="from Album where AlbUserID=? or AlbUserID=?";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setInteger(0, id);
		query.setInteger(1, boundid);
		List<Album> list=query.list();
		tx.commit();
		return list;
	}

	@Override
	public void album_del(int id) {
		// TODO Auto-generated method stub
		String hql="delete from Album where id=?";
		//Session session=sessionFactory.getCurrentSession();
		Session session=sessionFactory.openSession();
		Query query=session.createQuery(hql);
		query.setInteger(0,id);
		query.executeUpdate();
		session.beginTransaction().commit();
	}
}
