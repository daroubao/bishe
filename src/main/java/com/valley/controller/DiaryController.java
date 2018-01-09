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





import com.valley.entity.Comment;
import com.valley.entity.Diary;
import com.valley.entity.User;
import com.valley.service.CommentService;
import com.valley.service.DiaryService;
import com.valley.service.UserService;

@Controller
@RequestMapping("/diary")
public class DiaryController {
	@Autowired
	private DiaryService diaryService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private UserService signService;

	/* 日记添加 */
	@RequestMapping("/add")
	public String diary_add(@ModelAttribute Diary diary,HttpSession session) {
		int userid=(int) session.getAttribute("loginUserID");
		User prodis=signService.profilebyid(userid);
		diary.setUserName(prodis.getUserName());
		diary.setDiaUserID(userid);
		diaryService.diary_add(diary);
		return "redirect:/diary/display2";
	}

	/* 按最新时间展示仅两人可见日记 */

	@RequestMapping("/display2")
	public String diary_display2(Model model, HttpSession session) {
		int userid = (int) session.getAttribute("loginUserID");
		int bid= signService.profilebyid(userid).getBoundUserID();
		List<Diary> diary2list = diaryService.diary2_dis(userid,bid);
		model.addAttribute("diary2list", diary2list);
		Iterator<Diary> it = diary2list.iterator();

		while (it.hasNext()) {
			Diary d = it.next();
		}
		 return "diary2display";
	}

	/* 按热度展示仅两人可见日记 
	@RequestMapping("/display2h")
	public String diary_display2Hot(Model model, HttpSession session) {
		int userid = (int) session.getAttribute("loginUserID");
		List<Diary> diary2list = diaryService.diary2_dishot(userid);
		model.addAttribute("diary2list", diary2list);
		Iterator<Diary> it = diary2list.iterator();

		while (it.hasNext()) {
			Diary d = it.next();
		}
		return "diary2display";
	}*/

	/* 展示仅自己可见日记 */
	@RequestMapping("/display1")
	public String diary_display1(Model model, HttpSession session) {
		int userid = (int) session.getAttribute("loginUserID");
		List<Diary> diary1list = diaryService.diary1_dis(userid);
		model.addAttribute("diary1list", diary1list);
		Iterator<Diary> it = diary1list.iterator();

		while (it.hasNext()) {
			Diary d = it.next();
		}
		return "diary1display";
	}

	/* 展示所有人可见日记 */
	@RequestMapping("/displayall")
	public String diary_display1(Model model) {

		List<Diary> diaryalist = diaryService.diaryall_dis();
		model.addAttribute("diaryalist", diaryalist);
		Iterator<Diary> it = diaryalist.iterator();

		while (it.hasNext()) {
			Diary d = it.next();
		}
		return "diaryAlldisplay";
	}

	/* 日记详情页 */
	@RequestMapping("/details")
	public String diary_details(Model model, HttpServletRequest request) {
		int m = Integer.parseInt(request.getParameter("id"));
		System.out.println("显示id为:" + m + "的日记详情");
		Diary dia = diaryService.diary(m);
		model.addAttribute("diadetail", dia);
		
		System.out.println("显示id为:" + m + "的日记评论");
		List<Comment> list=commentService.com_dis(m);
		model.addAttribute("comdis", list);	
		Iterator<Comment> it=list.iterator();
		while(it.hasNext()){
			Comment c=it.next();
		}
		return "diarydisplay";
	}
	/*显示用户发表的所有日记*/
	@RequestMapping("/userdisplayall")
	public String userdiary_display(Model model,HttpSession session) {
		int userid = (int) session.getAttribute("loginUserID");
		
		List<Diary> diaryalist = diaryService.diaryall_dis();
		model.addAttribute("diaryalist", diaryalist);
		Iterator<Diary> it = diaryalist.iterator();

		while (it.hasNext()) {
			Diary d = it.next();
		}
		List<Diary> diary1list = diaryService.diary1_dis(userid);
		model.addAttribute("diary1list", diary1list);
		Iterator<Diary> it1 = diary1list.iterator();

		while (it1.hasNext()) {
			Diary d = it1.next();
		}
		
		List<Diary> diary2list = diaryService.diary2_dishot(userid);
		model.addAttribute("diary2list", diary2list);
		Iterator<Diary> it2 = diary2list.iterator();

		while (it2.hasNext()) {
			Diary d = it2.next();
		}
		
		return "userdiarydisplay";
	}
	
	@RequestMapping("/del")
	public String diary_del(Model model, HttpServletRequest request){
		int diaryid = Integer.parseInt(request.getParameter("diaryid"));
		System.out.println("删除id为:" + diaryid + "的日记详情");
		diaryService.diary_del(diaryid);
		
		return "redirect:/diary/userdisplayall";
	}

}
