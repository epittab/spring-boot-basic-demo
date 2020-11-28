package com.example.demo.service;

import com.example.demo.dao.PersonDAO;
import com.example.demo.model.Person;

public class PersonService {

    private final PersonDAO personDao;

    public PersonService(PersonDAO personDao){
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
