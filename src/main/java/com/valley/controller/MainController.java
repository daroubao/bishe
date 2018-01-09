package com.valley.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/indexr")
	public String indexr(){
		return "index";
	}
	@RequestMapping("/login")
	public String adminLogin(){
		System.out.println("登录路径");
		return "sign_in";
	}
	
	@RequestMapping("/reg")
	public String sign_reg(){
		return "sign_reg";
	}
	
	@RequestMapping("/notea")
	public String note_add(){
		return "note_add";
	}
	@RequestMapping("/boundr")
	public String bound(){
		return "bound";
	}
	@RequestMapping("/diaryd")
	public String diaryd(){
		return "shareDiary";
	}
	
	
}
