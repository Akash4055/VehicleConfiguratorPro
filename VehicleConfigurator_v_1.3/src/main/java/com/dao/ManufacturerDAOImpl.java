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
	public List<Manufacturer> getManufacturers(String sname) {
		// TODO Auto-generated method stub
		
		List<Segment> segments =(List<Segment>)template.findByNamedParam("from Segment s where s.sname=:sname","sname",sname);
		int sid= segments.get(0).getSid();
		List<Manufacturer>mylist=(List<Manufacturer>) template.findByNamedParam("from Manufacturer m where m.sid=:sid","sid",sid);
		return mylist;                           	
		
	}

}
