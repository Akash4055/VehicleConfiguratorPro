package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.models.Manufacturer;
import com.models.Segment;
import com.models.Variant;

@Repository
@Transactional
public class VariantDAOImpl implements VariantDAO {
	@Autowired
	HibernateTemplate template;
	@Override
	public List<Variant> getVariants(String sname,String mname) {
		// TODO Auto-generated method stub
		List<Segment> segments =(List<Segment>)template.findByNamedParam("from Segment s where s.sname=:sname","sname",sname);
		Integer sid= segments.get(0).getSid();
		List<Manufacturer> manufacturers =(List<Manufacturer>)template.findByNamedParam("from Manufacturer m where m.mname=:mname and m.sid=:sid1",new String[] {"mname","sid1"},new Object[] {mname,sid});
		Integer mid= manufacturers.get(0).getMid();
		List<Variant>mylist=(List<Variant>) template.findByNamedParam("from Variant m where m.sid=:id and m.mid=:id1",new String[] {"id","id1"},new Object[] {sid,mid});
		return mylist;                           	
		
	}

}
