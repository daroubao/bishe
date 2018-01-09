package com.valley.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valley.dao.AlbumDao;
import com.valley.entity.Album;
import com.valley.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService{
	@Autowired
	private AlbumDao albumDao;
	@Override
	public void album_add(Album album) {
		// TODO Auto-generated method stub
		albumDao.album_add(album);
	}

	@Override
	public List<Album> album_display(int id, int boundid) {
		// TODO Auto-generated method stub
		List<Album> list=albumDao.album_display(id, boundid);
		return list;
	}

	@Override
	public void album_del(int id) {
		// TODO Auto-generated method stub
		albumDao.album_del(id);
	}

}
