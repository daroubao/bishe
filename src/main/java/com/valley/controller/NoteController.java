package com.valley.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.valley.entity.Note;
import com.valley.service.NoteService;

@Controller
@RequestMapping("/note")
public class NoteController {
	
	@Autowired
	private NoteService noteService;
	
	@RequestMapping("/add")
	public String note_add(@ModelAttribute Note note,HttpSession session){
		int userid=(int) session.getAttribute("loginUserID");
		note.setNoteUserID(userid);
		noteService.note_add(note);
		session.setAttribute("id", note.getId());
		return "redirect:/note/display";
	}
	
	
	@RequestMapping("/display")
	public String note_display(Model model,HttpSession session){
		int userid=(int) session.getAttribute("loginUserID");
		System.out.println("查询用户"+userid+"的标签");
		List<Note> list=noteService.note_display(userid);
		model.addAttribute("list", list);
		Iterator<Note> it=list.iterator();
		
		while(it.hasNext()){
			Note n=it.next();
			
		}
		return "note_display";
	}
	
	@RequestMapping("/del")
	public String note_del(@ModelAttribute Note note,HttpServletRequest request){
		
		int m=Integer.parseInt(request.getParameter("noteid"))  ;
		
		System.out.println("del打印的notei值为:"+m);
	

		noteService.note_del(m);
		return "redirect:/note/display";
	}

}
