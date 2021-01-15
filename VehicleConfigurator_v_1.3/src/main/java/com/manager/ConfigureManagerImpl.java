package com.manager;

import java.util.List;
import org.springframework.stereotype.Service;
import com.dao.ConfigureDAO;
import com.models.Configure;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ConfigureManagerImpl implements ConfigureManager {

	@Autowired
	public ConfigureDAO dao;
	
	@Override
	public List<Configure> getConfigure(int vid) {
		// TODO Auto-generated method stub
		return dao.getConfigure(vid);
	}

}
