package com.segment;

import java.util.List;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SegmentManagerImpl implements SegmentManager {

	@Autowired
	SegmentDAO dao;
	@Override
	public List<Segment> getSegments() {
		// TODO Auto-generated method stub
		return dao.getSegments();
	}

}
