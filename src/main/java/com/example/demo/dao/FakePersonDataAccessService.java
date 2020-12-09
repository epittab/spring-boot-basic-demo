package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

import org.springframework.stereotype.Repository;

@Repository("fakeDAO")
public class FakePersonDataAccessService implements PersonDAO {

    private static List<Person> DB = new ArrayList<Person>();

    @Override
    public int insertPerson(UUID id, Person person) {
        // TODO Auto-generated method stub
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> getPeople() {
        return DB;
    }

    @Override
    public int deletePerson(UUID id) {
        // TODO Auto-generated method stub
        
        for (int i = 0; i < DB.size(); i++) {
            Person p = DB.get(i);
            if (p.getId().equals(id)) { 
                DB.remove(p);
                return 1;
            }
        }
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Optional<Person> getPersonById(UUID id) {
        // TODO Auto-generated method stub
        return DB.stream()
            .filter(person -> person.getId().equals(id))
            .findFirst();
    }
    
}
