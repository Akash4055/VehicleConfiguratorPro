package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.manager.VariantManager;

@RestController  
@CrossOrigin("http://localhost:4200")
public class VariantController {
	@Autowired
	public VariantManager manager;
	@GetMapping(value = "variants/{sname}/{mname}",headers = "Accept=application/json")  
	 public String showVariants(@PathVariable String sname,@PathVariable String mname)
	 {
		  return new Gson().toJson(manager.getVariants(sname,mname));
	 }
	@GetMapping(value = "variants/{vid}",headers = "Accept=application/json")  
	 public String showVariantById(@PathVariable int vid)
	 {
		  return new Gson().toJson(manager.getVariantById(vid));
	 }
			

}
