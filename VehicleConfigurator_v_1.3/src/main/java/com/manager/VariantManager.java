package com.manager;

import java.util.List;
import com.models.Variant;

public interface VariantManager {
	List<Variant> getVariants(String sname,String mname);
	Variant getVariantById(int vid);

}
