package be.abis.springsoapservice.repository;

import be.abis.springsoapservice.model.Person;

import java.util.List;

public interface PersonRepository {

    Person findPerson(int id);
    List<Person> findAllPersons();
    void addPerson(Person person);

}
