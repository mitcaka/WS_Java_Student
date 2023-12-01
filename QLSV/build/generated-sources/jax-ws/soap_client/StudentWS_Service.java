
package soap_client;

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
@WebServiceClient(name = "StudentWS", targetNamespace = "http://soap/", wsdlLocation = "http://localhost:8080/QLSV/StudentWS?wsdl")
public class StudentWS_Service
    extends Service
{

    private final static URL STUDENTWS_WSDL_LOCATION;
    private final static WebServiceException STUDENTWS_EXCEPTION;
    private final static QName STUDENTWS_QNAME = new QName("http://soap/", "StudentWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/QLSV/StudentWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STUDENTWS_WSDL_LOCATION = url;
        STUDENTWS_EXCEPTION = e;
    }

    public StudentWS_Service() {
        super(__getWsdlLocation(), STUDENTWS_QNAME);
    }

    public StudentWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTWS_QNAME, features);
    }

    public StudentWS_Service(URL wsdlLocation) {
        super(wsdlLocation, STUDENTWS_QNAME);
    }

    public StudentWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTWS_QNAME, features);
    }

    public StudentWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StudentWS
     */
    @WebEndpoint(name = "StudentWSPort")
    public StudentWS getStudentWSPort() {
        return super.getPort(new QName("http://soap/", "StudentWSPort"), StudentWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentWS
     */
    @WebEndpoint(name = "StudentWSPort")
    public StudentWS getStudentWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap/", "StudentWSPort"), StudentWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTWS_EXCEPTION!= null) {
            throw STUDENTWS_EXCEPTION;
        }
        return STUDENTWS_WSDL_LOCATION;
    }

}