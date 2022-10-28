package be.abis.springsoapservice.service;

import be.abis.springsoapservice.model.Person;
import be.abis.springsoapservice.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbisPersonService implements PersonService {

    @Autowired
    PersonRepository personRepository;


    @Override
    public Person findPerson(int id) {
        return personRepository.findPerson(id);
    }

    @Override
    public List<Person> findAllPersons() {
        return personRepository.findAllPersons();
    }

    @Override
    public void addPerson(Person person) {
        personRepository.addPerson(person);
    }
}
