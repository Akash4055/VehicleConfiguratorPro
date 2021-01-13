package com.manager;

import java.util.List;
import org.springframework.stereotype.Service;

import com.dao.SegmentDAO;
import com.models.Segment;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SegmentManagerImpl implements SegmentManager {

	@Autowired
	public SegmentDAO dao;
	@Override
	public List<Segment> getSegments() {
		// TODO Auto-generated method stub
		return dao.getSegments();
	}

}
