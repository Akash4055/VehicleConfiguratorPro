package com.manager;

import java.util.List;
import org.springframework.stereotype.Service;

import com.dao.ManufacturerDAO;
import com.models.Manufacturer;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ManufacturerManagerImpl implements ManufacturerManager {

	@Autowired
	public ManufacturerDAO dao;
	@Override
	public List<Manufacturer> getManufacturers() {
		// TODO Auto-generated method stub
		return dao.getManufacturers();
	}

}
