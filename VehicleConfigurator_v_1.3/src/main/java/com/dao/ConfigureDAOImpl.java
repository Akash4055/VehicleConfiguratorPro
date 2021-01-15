package com.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.models.Configure;

@Repository
@Transactional
public class ConfigureDAOImpl implements ConfigureDAO {
	
	@Autowired
	HibernateTemplate template;
	
	@Override
	public List<Configure> getConfigure(int vid) {
		// TODO Auto-generated method stub
		List<Configure>mylist=(List<Configure>) template.findByNamedParam("from Configure c where c.vid=:vid1", "vid1", vid);
		return mylist;                           	
	}

}
