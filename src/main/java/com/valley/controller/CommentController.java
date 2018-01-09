package com.valley.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.valley.entity.Comment;
import com.valley.service.CommentService;

@Controller
@RequestMapping("/comment")
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("/add")
	public String com_add(@ModelAttribute Comment comment,HttpSession session){
		int userid=(int) session.getAttribute("loginUserID");
		String userName=(String) session.getAttribute("userName");
		comment.setComUserID(userid);
		comment.setComName(userName);
		commentService.com_add(comment);
		int id = comment.getComDiaryID();
		return "redirect:/diary/details?id="+id;
	}
	
}
