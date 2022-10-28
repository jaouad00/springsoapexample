package be.abis.springsoapservice.repository;

import be.abis.springsoapservice.model.Person;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryPersonRepository implements PersonRepository {

    List<Person> persons = new ArrayList<Person>();

    @PostConstruct
    public void init(){
        persons.add(new Person(1,"John",42));
        persons.add(new Person(2,"An",31));
        persons.add(new Person(3,"Bob",55));
    }

    @Override
    public Person findPerson(int id) {
        return persons.stream().filter(p->p.getPersonId()==id).findFirst().orElse(null);
    }

    @Override
    public List<Person> findAllPersons() {
        return persons;
    }

    @Override
    public void addPerson(Person person) {
        persons.add(person);
        System.out.println("person added: " + person);
    }
}
