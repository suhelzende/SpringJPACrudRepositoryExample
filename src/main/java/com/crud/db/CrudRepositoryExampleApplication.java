package com.crud.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.db.model.Person;
import com.crud.db.service.PersonService;

@SpringBootApplication
public class CrudRepositoryExampleApplication implements CommandLineRunner {

	@Autowired
	private PersonService personService;
	public static void main(String[] args) {
		SpringApplication.run(CrudRepositoryExampleApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		//createPerson();
		//createPersonFromList();
		//getPersonsForIds();
		//deletePerson();
//		getPersonsForIds();
//		updateAddressById();
//		getPersonsForIds();
	}


	private void updateAddressById() {
		
		personService.updateAddressById(2,"Mumbai");
	}


	private void deletePerson() {
		Person p = new Person();
		p.setId(1);
		personService.deletePerson(p);
	}


	private void getPersonsForIds()
	{
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		
		Iterable<Person> peronlist = personService.getPersonsByIds(ids);
		System.out.println(peronlist);
	}
}
