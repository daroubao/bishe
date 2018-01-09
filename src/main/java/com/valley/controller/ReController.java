package com.valley.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.valley.entity.Relevance;
import com.valley.entity.User;
import com.valley.service.ReService;

@Controller
@RequestMapping("/care")
public class ReController {
	@Autowired
	private ReService reService;
	
	@RequestMapping("/add")
	public String care_add(@ModelAttribute Relevance relevance,HttpSession session,HttpServletRequest request){
		int userid=(int) session.getAttribute("loginUserID");
		relevance.setCareUserID(userid);
		int m=Integer.parseInt(request.getParameter("caredUserID")) ;
		System.out.println(m);
		relevance.setCaredUserId(m);
		reService.care_add(relevance);
		return "redirect:/sign/showpro";
	}
	@RequestMapping("/del")
	public String care_del(@ModelAttribute Relevance relevance,HttpServletRequest request,HttpSession session){
		int caredid=Integer.parseInt(request.getParameter("caredid"));
		int userid=(int) session.getAttribute("loginUserID");
		System.out.println(caredid+userid);
		reService.care_del(userid,caredid);
		return "redirect:/sign/showpro";
	}
	@RequestMapping("/display")
	public String care_dis(Model model,HttpSession session){
		int userid=(int) session.getAttribute("loginUserID");
		List<User> list=reService.care_display(userid);
		model.addAttribute("list", list);
		Iterator<User> it=list.iterator();
		while(it.hasNext()){
			User u=it.next();
		}
		return null;
		
		
	}
	
}
