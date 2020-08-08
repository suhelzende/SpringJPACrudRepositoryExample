package com.crud.db.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.db.dao.PersonDAO;
import com.crud.db.model.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDAO personDAO;
	public Person createPerson(Person person) {
		return personDAO.save(person);
	}
	public List<Person> createPersonFromList(List<Person> list) {
		return (List<Person>) personDAO.saveAll(list);
		
	}
	public Iterable<Person> getPersonsByIds(List<Integer> ids) {
		return personDAO.findAllById(ids);
		
	}
	public void deletePerson(Person p) {
		
		personDAO.delete(p);		
	}
	
	public void updateAddressById(int id, String address) {
		Person p = personDAO.findById(id).get();
		if(p.getId() == id) {
			p.setAddress(address);
		}
		personDAO.save(p);
	}
	
	
	
}
