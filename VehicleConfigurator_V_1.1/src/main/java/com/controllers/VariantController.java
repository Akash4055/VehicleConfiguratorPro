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
	@GetMapping(value = "crud/variants/{sid}/{mid}",headers = "Accept=application/json")  
	 public String showVariants(@PathVariable int sid,@PathVariable int mid)
	 {
		  return new Gson().toJson(manager.getVariants(sid,mid));
	 }


}
