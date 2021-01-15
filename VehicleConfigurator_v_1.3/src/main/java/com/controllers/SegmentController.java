package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.manager.SegmentManager;

@RestController  
@CrossOrigin("http://localhost:4200")
public class SegmentController {
	@Autowired
	public SegmentManager manager;
	@GetMapping(value = "segments",headers = "Accept=application/json")  
	 public String showManufacturers()
	 {
		  return new Gson().toJson(manager.getSegments());
	 }


}
