package com.dao;

import java.util.List;
import com.models.Configure;

public interface ConfigureDAO {
	List<Configure> getConfigure(int vid);
	/*
	 * List<Configure> getConfigureBytype(int vid,int ftype);
	 * 	List<Configure> getModifyByType(int vid,int ftype);
	 * */
}
