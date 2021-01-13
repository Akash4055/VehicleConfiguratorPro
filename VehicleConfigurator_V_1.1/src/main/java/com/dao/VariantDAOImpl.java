package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.models.Variant;

@Repository
@Transactional
public class VariantDAOImpl implements VariantDAO {
	@Autowired
	HibernateTemplate template;
	@Override
	public List<Variant> getVariants(int sid,int mid) {
		// TODO Auto-generated method stub
		List<Variant>mylist=(List<Variant>) template.findByNamedParam("from Variant m where m.sid=:id and m.mid=:id1",new String[] {"id","id1"},new Object[] {sid,mid});
		return mylist;                           	
		
	}

}
