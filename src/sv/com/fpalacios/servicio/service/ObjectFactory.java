
package sv.com.fpalacios.servicio.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sv.com.fpalacios.servicio.service package. 
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

    private final static QName _ObtenerClienteResponse_QNAME = new QName("http://service.servicio.fpalacios.com.sv/", "obtenerClienteResponse");
    private final static QName _ObtenerCliente_QNAME = new QName("http://service.servicio.fpalacios.com.sv/", "obtenerCliente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sv.com.fpalacios.servicio.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerCliente }
     * 
     */
    public ObtenerCliente createObtenerCliente() {
        return new ObtenerCliente();
    }

    /**
     * Create an instance of {@link ObtenerClienteResponse }
     * 
     */
    public ObtenerClienteResponse createObtenerClienteResponse() {
        return new ObtenerClienteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.servicio.fpalacios.com.sv/", name = "obtenerClienteResponse")
    public JAXBElement<ObtenerClienteResponse> createObtenerClienteResponse(ObtenerClienteResponse value) {
        return new JAXBElement<ObtenerClienteResponse>(_ObtenerClienteResponse_QNAME, ObtenerClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.servicio.fpalacios.com.sv/", name = "obtenerCliente")
    public JAXBElement<ObtenerCliente> createObtenerCliente(ObtenerCliente value) {
        return new JAXBElement<ObtenerCliente>(_ObtenerCliente_QNAME, ObtenerCliente.class, null, value);
    }

}
