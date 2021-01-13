package com.segment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController  
@CrossOrigin("http://localhost:4200")
public class SegmentController {
	@Autowired
	SegmentManager manager;
	@GetMapping(value = "crud/segments",headers = "Accept=application/json")  
	 public String showProducts()
	 {
		  return new Gson().toJson(manager.getSegments());
	 }


}
