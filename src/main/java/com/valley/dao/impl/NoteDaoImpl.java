package com.valley.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.valley.dao.NoteDao;
import com.valley.entity.Note;

@Repository
public class NoteDaoImpl implements NoteDao{
	@Resource
	private SessionFactory sessionFactory;
	@Override
	public void note_add(Note note){
		System.out.println("便签添加执行");
		Session session=sessionFactory.getCurrentSession();
		System.out.println(session!=null);
		Transaction tx=session.beginTransaction();
		session.save(note);
		tx.commit();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Note> note_display(int id) {
		// TODO Auto-generated method stub
			System.out.println("便签展示执行");
			String hql="from Note where noteUserID="+id;
			Session session=sessionFactory.getCurrentSession();
			Transaction tx=session.beginTransaction();
			Query query=session.createQuery(hql);
			List<Note> list=query.list();
			tx.commit();
			return list;
	}
	@Override
	public void note_del(int id) {
		String hql="delete from Note where id=?";
		//Session session=sessionFactory.getCurrentSession();
		Session session=sessionFactory.openSession();
		Query query=session.createQuery(hql);
		query.setInteger(0,id);
		query.executeUpdate();
		session.beginTransaction().commit();
	}
}
		/*Session session=sessionFactory.getCurrentSession();
		System.out.println(session!=null);
		Transaction tx=session.beginTransaction();
		session.delete(note);
		
		tx.commit();*/
		
		/*public void delete(int id){

		String hql="delete Person as p where p.id=?";

		Query query=session.createQuery(hql);

		query.setInteger(0,id);

		query.executeUpdate();

		session.beginTransaction().commit();

		}*/
