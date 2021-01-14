package com.dao;

import java.util.List;
import com.models.Variant;

public interface VariantDAO {
	List<Variant> getVariants(String sname,String mname);
}
