package com.valley.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.valley.service.HeadpicService;
@Service
public class HeadpicServiceImpl implements HeadpicService{
	public String uploadFile(MultipartFile file, HttpServletRequest re){
        String path = re.getSession().getServletContext().getRealPath("images");
        String fileName=file.getOriginalFilename();
        System.out.println(fileName);
        if(file == null){
            System.out.println("文件上传出错，文件为空");
        }
        String newFileName = new Date().getTime()+fileName.substring(fileName.indexOf('.'));
        File targetFile = new File(path,newFileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        try {
            file.transferTo(targetFile);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件上传失败");
        }
        //String url = path+"/"+newFileName;
        String url = re.getContextPath()+"/images/"+ newFileName;
        System.out.println(url);
        return url;
        
	}
}
