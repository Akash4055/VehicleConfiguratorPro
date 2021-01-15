package com.manager;

import java.util.List;
import org.springframework.stereotype.Service;
import com.dao.VariantDAO;
import com.models.Variant;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class VariantManagerImpl implements VariantManager {

	@Autowired
	public VariantDAO dao;
	@Override
	public List<Variant> getVariants(String sname,String mname) {
		// TODO Auto-generated method stub
		return dao.getVariants(sname,mname);
	}
	public Variant getVariantById(int vid)
	{
		return dao.getVariantByVid(vid);
	}
}
