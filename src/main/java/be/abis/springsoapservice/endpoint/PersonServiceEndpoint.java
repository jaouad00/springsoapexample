package be.abis.springsoapservice.endpoint;

import be.abis.springsoapservice.endpoint.dto.*;
import be.abis.springsoapservice.model.Person;
import be.abis.springsoapservice.model.Persons;
import be.abis.springsoapservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class PersonServiceEndpoint {

    public static final String NAMESPACE_URI = "http://abis.be/model";

    @Autowired
    ObjectFactory objectFactory;

    @Autowired
    PersonService personService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "personByIdRequest")
    @ResponsePayload
    public PersonByIdResponse findPersonsById(@RequestPayload PersonByIdRequest personByIdRequest){
        int idToFind = personByIdRequest.getPersonId();
        System.out.println("finding person " + idToFind);
        PersonByIdResponse personByIdResponse = objectFactory.createPersonByIdResponse();
        personByIdResponse.setPerson(personService.findPerson(idToFind));
        return personByIdResponse;
    }

   @PayloadRoot(namespace = NAMESPACE_URI, localPart = "allPersonsRequest")
    @ResponsePayload
    public AllPersonsResponse findAllPersons(){
        AllPersonsResponse allPersonsResponse =objectFactory.createAllPersonsResponse();
        List<Person> persons = personService.findAllPersons();
        Persons allPersons = new Persons();
        allPersons.setPerson(persons);
        allPersonsResponse.setPersons(allPersons);
        return allPersonsResponse;
}






}
