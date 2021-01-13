package com.manager;

import java.util.List;
import org.springframework.stereotype.Service;

import com.dao.ManufacturerDAO;
import com.dao.VariantDAO;
import com.models.Manufacturer;
import com.models.Variant;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class VariantManagerImpl implements VariantManager {

	@Autowired
	public VariantDAO dao;
	@Override
	public List<Variant> getVariants(int sid,int mid) {
		// TODO Auto-generated method stub
		return dao.getVariants(sid,mid);
	}

}
