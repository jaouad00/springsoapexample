package be.abis.springsoapservice.service;

import be.abis.springsoapservice.model.Person;

import java.util.List;

public interface PersonService {

    Person findPerson(int id);
    List<Person> findAllPersons();
    void addPerson(Person person);

}
