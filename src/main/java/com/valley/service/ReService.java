package com.valley.service;

import java.util.List;

import com.valley.entity.Relevance;
import com.valley.entity.User;

public interface ReService {
	public void care_add(Relevance relevance);
	
	public List<User> care_display(int id);
	
	public void care_del(int userid,int caredid);
}
