package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

public interface PersonDAO {
    
    public int insertPerson(UUID id, Person person);
    public List<Person> getPeople();
    public int deletePerson(UUID id);
    public int updatePersonById(UUID id, Person person);
    public Optional<Person> getPersonById(UUID id);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    };

}
