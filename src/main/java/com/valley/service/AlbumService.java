package com.valley.service;

import java.util.List;

import com.valley.entity.Album;


public interface AlbumService {
	public void album_add(Album album);
	
	public List<Album> album_display(int id,int boundid);
	
	public void album_del(int id);

}
