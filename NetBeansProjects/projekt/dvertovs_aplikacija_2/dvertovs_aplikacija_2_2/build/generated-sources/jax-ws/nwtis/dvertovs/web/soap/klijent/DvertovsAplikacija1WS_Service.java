
package nwtis.dvertovs.web.soap.klijent;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DvertovsAplikacija1WS", targetNamespace = "http://serveri.ws.dvertovs.nwtis/", wsdlLocation = "http://localhost:8080/dvertovs_aplikacija_1/DvertovsAplikacija1WS?wsdl")
public class DvertovsAplikacija1WS_Service
    extends Service
{

    private final static URL DVERTOVSAPLIKACIJA1WS_WSDL_LOCATION;
    private final static WebServiceException DVERTOVSAPLIKACIJA1WS_EXCEPTION;
    private final static QName DVERTOVSAPLIKACIJA1WS_QNAME = new QName("http://serveri.ws.dvertovs.nwtis/", "DvertovsAplikacija1WS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/dvertovs_aplikacija_1/DvertovsAplikacija1WS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DVERTOVSAPLIKACIJA1WS_WSDL_LOCATION = url;
        DVERTOVSAPLIKACIJA1WS_EXCEPTION = e;
    }

    public DvertovsAplikacija1WS_Service() {
        super(__getWsdlLocation(), DVERTOVSAPLIKACIJA1WS_QNAME);
    }

    public DvertovsAplikacija1WS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DVERTOVSAPLIKACIJA1WS_QNAME, features);
    }

    public DvertovsAplikacija1WS_Service(URL wsdlLocation) {
        super(wsdlLocation, DVERTOVSAPLIKACIJA1WS_QNAME);
    }

    public DvertovsAplikacija1WS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DVERTOVSAPLIKACIJA1WS_QNAME, features);
    }

    public DvertovsAplikacija1WS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DvertovsAplikacija1WS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DvertovsAplikacija1WS
     */
    @WebEndpoint(name = "DvertovsAplikacija1WSPort")
    public DvertovsAplikacija1WS getDvertovsAplikacija1WSPort() {
        return super.getPort(new QName("http://serveri.ws.dvertovs.nwtis/", "DvertovsAplikacija1WSPort"), DvertovsAplikacija1WS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DvertovsAplikacija1WS
     */
    @WebEndpoint(name = "DvertovsAplikacija1WSPort")
    public DvertovsAplikacija1WS getDvertovsAplikacija1WSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serveri.ws.dvertovs.nwtis/", "DvertovsAplikacija1WSPort"), DvertovsAplikacija1WS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DVERTOVSAPLIKACIJA1WS_EXCEPTION!= null) {
            throw DVERTOVSAPLIKACIJA1WS_EXCEPTION;
        }
        return DVERTOVSAPLIKACIJA1WS_WSDL_LOCATION;
    }

}
