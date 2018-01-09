package com.valley.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.valley.dao.CommentDao;
import com.valley.dao.UserDao;
import com.valley.entity.User;
import com.valley.dao.DiaryDao;
import com.valley.entity.Diary;
import com.valley.entity.Comment;

@Repository
public class CommentDaoImpl implements CommentDao{

	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	public void com_add(Comment comment) {
		// TODO Auto-generated method stub
		System.out.println("评论DAO添加执行");
		int diaryid=comment.getComDiaryID();
		System.out.println("日记编号"+diaryid);
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.save(comment);
		
		String hql1="From Diary Where id=?";
		Query query=session.createQuery(hql1);
		query.setParameter(0, diaryid);
		Diary diary=(Diary) query.uniqueResult();
		int id=diary.getDiaUserID();
		System.out.println("用户id为"+id);
		
		String hql2="update User set score=score+2 where userID=?";
		Query query2=session.createQuery(hql2);
		query2.setParameter(0, id);
		query2.executeUpdate();
		
		tx.commit();
	}

	@Override
	public List<Comment> com_dis(int comDiaryid) {
		// TODO Auto-generated method stub
		System.out.println("评论显示执行");
		String hql="from Comment where comDiaryID=? ORDER BY id DESC";
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter(0,comDiaryid);
		List<Comment> list=query.list();
		tx.commit();
		return list;
	}

}
