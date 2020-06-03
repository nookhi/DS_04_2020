
package service.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.endpoint package. 
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

    private final static QName _GetAllSushiDirectoryResponse_QNAME = new QName("http://endpoint.service/", "getAllSushiDirectoryResponse");
    private final static QName _SetNewSushiDirectoryResponse_QNAME = new QName("http://endpoint.service/", "setNewSushiDirectoryResponse");
    private final static QName _GetAllSushiDirectory_QNAME = new QName("http://endpoint.service/", "getAllSushiDirectory");
    private final static QName _SetNewSushiDirectory_QNAME = new QName("http://endpoint.service/", "setNewSushiDirectory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllSushiDirectoryResponse }
     * 
     */
    public GetAllSushiDirectoryResponse createGetAllSushiDirectoryResponse() {
        return new GetAllSushiDirectoryResponse();
    }

    /**
     * Create an instance of {@link SetNewSushiDirectoryResponse }
     * 
     */
    public SetNewSushiDirectoryResponse createSetNewSushiDirectoryResponse() {
        return new SetNewSushiDirectoryResponse();
    }

    /**
     * Create an instance of {@link GetAllSushiDirectory }
     * 
     */
    public GetAllSushiDirectory createGetAllSushiDirectory() {
        return new GetAllSushiDirectory();
    }

    /**
     * Create an instance of {@link SetNewSushiDirectory }
     * 
     */
    public SetNewSushiDirectory createSetNewSushiDirectory() {
        return new SetNewSushiDirectory();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSushiDirectoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getAllSushiDirectoryResponse")
    public JAXBElement<GetAllSushiDirectoryResponse> createGetAllSushiDirectoryResponse(GetAllSushiDirectoryResponse value) {
        return new JAXBElement<GetAllSushiDirectoryResponse>(_GetAllSushiDirectoryResponse_QNAME, GetAllSushiDirectoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNewSushiDirectoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "setNewSushiDirectoryResponse")
    public JAXBElement<SetNewSushiDirectoryResponse> createSetNewSushiDirectoryResponse(SetNewSushiDirectoryResponse value) {
        return new JAXBElement<SetNewSushiDirectoryResponse>(_SetNewSushiDirectoryResponse_QNAME, SetNewSushiDirectoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSushiDirectory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "getAllSushiDirectory")
    public JAXBElement<GetAllSushiDirectory> createGetAllSushiDirectory(GetAllSushiDirectory value) {
        return new JAXBElement<GetAllSushiDirectory>(_GetAllSushiDirectory_QNAME, GetAllSushiDirectory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNewSushiDirectory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.service/", name = "setNewSushiDirectory")
    public JAXBElement<SetNewSushiDirectory> createSetNewSushiDirectory(SetNewSushiDirectory value) {
        return new JAXBElement<SetNewSushiDirectory>(_SetNewSushiDirectory_QNAME, SetNewSushiDirectory.class, null, value);
    }

}
