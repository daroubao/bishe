package com.valley.dao;

import java.util.List;

import com.valley.entity.Festival;


public interface FestivalDao {
	
	public void fes_add(Festival festival);
	
	public List<Festival> fes_display(int id);
	
	public void fes_del(int id);
	
	public void fes_update(int id);

}
