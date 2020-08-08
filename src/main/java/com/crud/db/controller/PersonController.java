package com.crud.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.db.model.Person;
import com.crud.db.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService personservice;
	@PostMapping("/addPerson")
	public Person addPerson(@RequestBody Person person) {
		System.out.println(person);
		return personservice.createPerson(person);
	}
	
	
}
