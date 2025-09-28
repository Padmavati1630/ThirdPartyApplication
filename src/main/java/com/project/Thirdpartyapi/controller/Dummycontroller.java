package com.project.Thirdpartyapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.Thirdpartyapi.model.Dummy;
import com.project.Thirdpartyapi.service.Dummyservice;

@RestController
public class Dummycontroller {

	@Autowired
	Dummyservice dummyservice;
	
	@PostMapping("/a")
	public String abc() {
		RestTemplate restTemplate=new RestTemplate();
		Dummy[] d=restTemplate.getForObject("https://jsonplaceholder.typicode.com/users",Dummy[].class);
		
		dummyservice.insertdata(d);
		return "data saved";
		
	}
}
