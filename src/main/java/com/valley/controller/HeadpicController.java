package com.valley.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.valley.dao.UserDao;
import com.valley.service.HeadpicService;

@Controller
public class HeadpicController {
	@Autowired
    private UserDao signDao;
    @Autowired
    private HeadpicService headpicService;
    @RequestMapping("/headchange")
    public String jobFile(HttpServletRequest request, MultipartFile file,HttpSession session){
    	
    	int userid=(int) session.getAttribute("loginUserID");
        String url = headpicService.uploadFile(file,request);
        String imgurl = "127.0.0.1:8080"+url;
        signDao.picurl_upload(imgurl, userid);
        return "redirect:/sign/showpro";
    }

}
