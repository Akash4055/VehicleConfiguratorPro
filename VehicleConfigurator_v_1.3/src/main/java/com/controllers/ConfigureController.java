package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.manager.ConfigureManager;

@RestController  
@CrossOrigin("http://localhost:4200")
public class ConfigureController {
	
	@Autowired
	public ConfigureManager manager;
	
	@GetMapping(value = "configure/{vid}",headers = "Accept=application/json")  
	 public String showManufacturers(@PathVariable int vid)
	 {
		  return new Gson().toJson(manager.getConfigure(vid));
	 }


}
