package com.valley.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.valley.entity.Festival;
import com.valley.service.FestivalService;

@Controller
@RequestMapping("/fes")
public class FestivalController {
	@Autowired
	private FestivalService festivalService;
	

	@RequestMapping("/add")
	public String fes_add(HttpServletRequest request,HttpSession session) throws Throwable{
		int userid=(int) session.getAttribute("loginUserID");
		System.out.println("纪念日添加执行");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟  
		
		Date date=sdf.parse(request.getParameter("fesDate"));  
		String title=request.getParameter("fesTitle");
		String de=request.getParameter("fesDesc");
		Festival festival=new Festival();
		festival.setFesDate(date);
		festival.setFesTitle(title);
		festival.setFesDesc(de);
		festival.setFesUserID(userid);
		festivalService.fes_add(festival);
		session.setAttribute("id", festival.getId());
		return "redirect:/fes/display";
	}
	
	@RequestMapping("/del")
	public String fes_del(@ModelAttribute Festival festival,HttpServletRequest request){
		int m=Integer.parseInt(request.getParameter("fesid"))  ;
		System.out.println("删除的纪念日id值为:"+m);
		festivalService.fes_del(m);
		return "redirect:/fes/display";
	}
	
	@RequestMapping("/display")
	public String fes_display(Model model,HttpSession session){
		int userid=(int) session.getAttribute("loginUserID");
		System.out.println("查询用户"+userid+"的纪念日");
		List<Festival> list=festivalService.fes_display(userid);
		model.addAttribute("list", list);
		Iterator<Festival> it=list.iterator();
		
		while(it.hasNext()){
			Festival f=it.next();
			
		}
		return "fes_display";
	}
	
}
