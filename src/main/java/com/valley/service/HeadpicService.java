package com.valley.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public interface HeadpicService {
	public String uploadFile(MultipartFile file, HttpServletRequest re);

}
