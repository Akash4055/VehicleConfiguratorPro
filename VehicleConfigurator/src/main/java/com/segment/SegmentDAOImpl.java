package com.segment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class SegmentDAOImpl implements SegmentDAO {
	@Autowired
	HibernateTemplate template;
	@Override
	public List<Segment> getSegments() {
		// TODO Auto-generated method stub
		List<Segment>mylist=(List<Segment>) template.find("from Segment p");
		
		return mylist;
		
	}

}
