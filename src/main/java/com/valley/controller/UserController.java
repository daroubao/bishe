package com.valley.controller;

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
import com.valley.service.UserService;

@Controller
@RequestMapping("/sign")
public class UserController {
	@Autowired
	private UserService signService;
	@Autowired
	private ReService reService;
	
	@RequestMapping("/in")
	public String in(@ModelAttribute User sign,Model model,HttpSession session){
		
		System.out.println(sign.getUserID());
		System.out.println(sign.getPassword());
		User s=signService.login(sign);
		if(s!=null){
			model.addAttribute("sign",s);
			session.setAttribute("loginUserID", s.getUserID());
			session.setAttribute("userName", s.getUserName());
			int userid=s.getUserID();
			User prodis=signService.profilebyid(userid);
			model.addAttribute("pro", prodis);
			System.out.println(prodis.toString());
			return "/index";
		}else{
			return "redirect:/login";
		}
	}

	@RequestMapping("/regs")
	public String sign_reg(@ModelAttribute User sign){
		sign.setScore(Integer.valueOf("0"));
		sign.setUserName(sign.getUserID().toString());
		sign.setBoundUserID(sign.getUserID());
		sign.setPicUrl("img/profile_small.jpg");
		signService.sign_reg(sign);
		return "redirect:/login";
	}
	
	@RequestMapping("/bound")
	public String bounduser(@ModelAttribute User sign,Model model,HttpSession session,HttpServletRequest request){
		
		System.out.println("绑定用户id为"+sign.getUserID());
		
		int userid=(int) session.getAttribute("loginUserID");
		System.out.println("当前已登录用户id为"+userid);
		
		User s=signService.login(sign);
		if(s!=null){
			
		/*	model.addAttribute("sign",s);
			session.setAttribute("loginUserID", s.getUserID());*/
			signService.bound(userid,sign.getUserID());
			
			User prodis=signService.profilebyid(userid);
			model.addAttribute("pro", prodis);
			System.out.println(prodis.toString());
			return "/index";
		}else{
			return "redirect:sign/bound";
		}	
	}

	@RequestMapping("/showpro")
	public String profiledis(Model model, HttpServletRequest request,HttpSession session){
		int userid=(int) session.getAttribute("loginUserID");
		User prodis=signService.profilebyid(userid);
		model.addAttribute("pro", prodis);
		System.out.println(prodis.toString());
		List<User> list=reService.care_display(userid);
		model.addAttribute("list", list);
		for(int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i).toString());
		}
		
		return "profile";
	}
	@RequestMapping("/showInf")
	public String showInf(Model model, HttpServletRequest request,HttpSession session){
		int userid= Integer.parseInt(request.getParameter("id"));
		User prodis=signService.profilebyid(userid);
		model.addAttribute("inf", prodis);
		
		
		return "showinf";
	}
	@RequestMapping("/unbound")
	public String unbound(HttpSession session){
		int userid=(int) session.getAttribute("loginUserID");
		int boundid= signService.profilebyid(userid).getBoundUserID();
		signService.unbound(userid,boundid);
		return"redirect:/login";
	}
	
	@RequestMapping("/up")
	public String pro_update(HttpServletRequest request,HttpSession session){
		String userName=request.getParameter("userName");
		String sex=request.getParameter("sex");
		String descr=request.getParameter("descr");
		int userid=(int) session.getAttribute("loginUserID");
		signService.pro_update(userName,sex,descr,userid);
		return "redirect:/sign/showpro";
	}
	
}
