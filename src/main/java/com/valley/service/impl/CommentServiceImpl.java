package com.valley.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valley.dao.CommentDao;
import com.valley.entity.Comment;
import com.valley.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{
	@Autowired
	private CommentDao commentDao;
	@Override
	public void com_add(Comment comment) {
		// TODO Auto-generated method stub
		commentDao.com_add(comment);
	}
	@Override
	public List<Comment> com_dis(int comDiaryID) {
		// TODO Auto-generated method stub
		List<Comment> list=commentDao.com_dis(comDiaryID);
		
		return list;
	}

}
