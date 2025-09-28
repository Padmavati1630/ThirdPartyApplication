package com.project.Thirdpartyapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Thirdpartyapi.model.Dummy;
import com.project.Thirdpartyapi.repository.Dummyrepository;

@Service
public class Dummyservice {

	@Autowired
	Dummyrepository dummyrepository;
	
	public void insertdata(Dummy[] d) {
		List<Dummy> list=new ArrayList<Dummy>();
		for(Dummy v:d) {
			Dummy dummy=new Dummy();
			dummy.setId(v.getId());
			dummy.setName(v.getName());
			dummy.setEmail(v.getEmail());
			list.add(dummy);
		}
		dummyrepository.saveAll(list);
	}
}
