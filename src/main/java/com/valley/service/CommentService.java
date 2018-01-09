package com.valley.service;

import java.util.List;

import com.valley.entity.Comment;

public interface CommentService {
	
	public void com_add(Comment comment);
	
	public List<Comment> com_dis(int comDiaryID);
}
