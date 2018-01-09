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

import com.valley.entity.Album;
import com.valley.entity.Note;
import com.valley.service.AlbumService;
import com.valley.service.UserService;

@Controller
@RequestMapping("album")
public class AlbumController {
	@Autowired
	private AlbumService albumService;
	@Autowired
	private UserService signService;
	
	@RequestMapping("/add")
	public String album_add(@ModelAttribute Album album,HttpSession session){
		int userid=(int) session.getAttribute("loginUserID");
		album.setAlbUserID(userid);
		albumService.album_add(album);
		session.setAttribute("id", album.getId());
		return "redirect:/album/display";
	}
	
	@RequestMapping("/display")
	public String album_display(Model model,HttpSession session){
		int userid=(int) session.getAttribute("loginUserID");
		System.out.println("查询用户"+userid+"的相册");
		int boundid= signService.profilebyid(userid).getBoundUserID();
		List<Album> list=albumService.album_display(userid, boundid);
		model.addAttribute("list", list);
		Iterator<Album> it=list.iterator();	
		while(it.hasNext()){
			Album a=it.next();
		}
		return "album";
	}
	
	@RequestMapping("/del")
	public String album_del(@ModelAttribute Album album,HttpServletRequest request){
		int albumid=Integer.parseInt(request.getParameter("albumid"))  ;
		System.out.println("删除的相册编号"+albumid);
		albumService.album_del(albumid);
		return "redirect:/album/display";
	}

}
