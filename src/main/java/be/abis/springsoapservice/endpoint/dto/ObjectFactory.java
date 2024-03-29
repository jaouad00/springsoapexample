//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.27 at 02:36:24 PM CEST 
//


package be.abis.springsoapservice.endpoint.dto;

import be.abis.springsoapservice.model.Person;
import be.abis.springsoapservice.model.Persons;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the be.abis.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@Component
public class ObjectFactory {

    private final static QName _PersonId_QNAME = new QName("http://abis.be/model", "personId");
    private final static QName _AllPersonsRequest_QNAME = new QName("http://abis.be/model", "allPersonsRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: be.abis.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Persons }
     * 
     */
    public Persons createPersons() {
        return new Persons();
    }

    /**
     * Create an instance of {@link PersonByIdRequest }
     * 
     */
    public PersonByIdRequest createPersonByIdRequest() {
        return new PersonByIdRequest();
    }

    /**
     * Create an instance of {@link PersonByIdResponse }
     * 
     */
    public PersonByIdResponse createPersonByIdResponse() {
        return new PersonByIdResponse();
    }

    /**
     * Create an instance of {@link AllPersonsResponse }
     * 
     */
    public AllPersonsResponse createAllPersonsResponse() {
        return new AllPersonsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://abis.be/model", name = "personId")
    public JAXBElement<Integer> createPersonId(Integer value) {
        return new JAXBElement<Integer>(_PersonId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://abis.be/model", name = "allPersonsRequest")
    public JAXBElement<Object> createAllPersonsRequest(Object value) {
        return new JAXBElement<Object>(_AllPersonsRequest_QNAME, Object.class, null, value);
    }

}
