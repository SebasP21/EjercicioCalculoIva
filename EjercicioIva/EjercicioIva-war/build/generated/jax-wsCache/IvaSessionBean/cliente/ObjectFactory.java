
package cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente package. 
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

    private final static QName _IvaMethod_QNAME = new QName("http://Iva/", "ivaMethod");
    private final static QName _IvaMethodResponse_QNAME = new QName("http://Iva/", "ivaMethodResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IvaMethod }
     * 
     */
    public IvaMethod createIvaMethod() {
        return new IvaMethod();
    }

    /**
     * Create an instance of {@link IvaMethodResponse }
     * 
     */
    public IvaMethodResponse createIvaMethodResponse() {
        return new IvaMethodResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IvaMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Iva/", name = "ivaMethod")
    public JAXBElement<IvaMethod> createIvaMethod(IvaMethod value) {
        return new JAXBElement<IvaMethod>(_IvaMethod_QNAME, IvaMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IvaMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Iva/", name = "ivaMethodResponse")
    public JAXBElement<IvaMethodResponse> createIvaMethodResponse(IvaMethodResponse value) {
        return new JAXBElement<IvaMethodResponse>(_IvaMethodResponse_QNAME, IvaMethodResponse.class, null, value);
    }

}
