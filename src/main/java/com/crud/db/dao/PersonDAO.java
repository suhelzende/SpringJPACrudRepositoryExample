package com.crud.db.dao;

import org.springframework.data.repository.CrudRepository;

import com.crud.db.model.Person;

public interface PersonDAO extends CrudRepository<Person, Integer>{

}
