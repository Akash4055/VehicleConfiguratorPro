package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.models.Manufacturer;
import com.models.Segment;

@Repository
@Transactional
public class ManufacturerDAOImpl implements ManufacturerDAO {
	@Autowired
	HibernateTemplate template;
	@Override
	public List<Manufacturer> getManufacturers() {
		// TODO Auto-generated method stub
		List<Manufacturer>mylist=(List<Manufacturer>) template.find("from Manufacturer m");
		return mylist;                           	
		
	}

}
