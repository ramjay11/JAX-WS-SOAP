
package employeemanagement.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the employeemanagement.services package. 
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
public class ObjectFactory {

    private final static QName _GetEmployeeByIDResponse_QNAME = new QName("http://services.employeemanagement/", "getEmployeeByIDResponse");
    private final static QName _GetEmployeeByID_QNAME = new QName("http://services.employeemanagement/", "getEmployeeByID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: employeemanagement.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeByID }
     * 
     */
    public GetEmployeeByID createGetEmployeeByID() {
        return new GetEmployeeByID();
    }

    /**
     * Create an instance of {@link GetEmployeeByIDResponse }
     * 
     */
    public GetEmployeeByIDResponse createGetEmployeeByIDResponse() {
        return new GetEmployeeByIDResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.employeemanagement/", name = "getEmployeeByIDResponse")
    public JAXBElement<GetEmployeeByIDResponse> createGetEmployeeByIDResponse(GetEmployeeByIDResponse value) {
        return new JAXBElement<GetEmployeeByIDResponse>(_GetEmployeeByIDResponse_QNAME, GetEmployeeByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.employeemanagement/", name = "getEmployeeByID")
    public JAXBElement<GetEmployeeByID> createGetEmployeeByID(GetEmployeeByID value) {
        return new JAXBElement<GetEmployeeByID>(_GetEmployeeByID_QNAME, GetEmployeeByID.class, null, value);
    }

}
