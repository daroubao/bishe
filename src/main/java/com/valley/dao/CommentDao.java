package com.valley.dao;

import java.util.List;

import com.valley.entity.Comment;



public interface CommentDao {
	
	public void com_add(Comment comment);
	
	public List<Comment> com_dis(int comDiaryid);

}
