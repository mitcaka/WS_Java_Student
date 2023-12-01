/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soap;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import soap_client.FindAllResponse;
import soap_client.StudentWS;

/**
 * REST Web Service
 *
 * @author ADMIN
 */
@Path("studentwsport")
public class StudentWSPort {

    private StudentWS port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of StudentWSPort
     */
    public StudentWSPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method findAll
     * @return an instance of javax.xml.bind.JAXBElement<soap_client.FindAllResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("findall/")
    public JAXBElement<FindAllResponse> getFindAll() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<soap_client.Student> result = port.findAll();

                class FindAllResponse_1 extends soap_client.FindAllResponse {

                    FindAllResponse_1(java.util.List<soap_client.Student> _return) {
                        this._return = _return;
                    }
                }
                soap_client.FindAllResponse response = new FindAllResponse_1(result);
                return new soap_client.ObjectFactory().createFindAllResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method addStudent
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @param arg3 resource URI parameter
     */
    @PUT
    @Consumes("text/plain")
    @Path("addstudent/")
    public void putAddStudent(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2") String arg2, @QueryParam("arg3")
            @DefaultValue("0") int arg3) {
        try {
            // Call Web Service Operation
            if (port != null) {
                port.addStudent(arg0, arg1, arg2, arg3);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    }

    /**
     * Invokes the SOAP method updateStudent
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @param arg3 resource URI parameter
     */
    @PUT
    @Consumes("text/plain")
    @Path("updatestudent/")
    public void putUpdateStudent(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2") String arg2, @QueryParam("arg3")
            @DefaultValue("0") int arg3) {
        try {
            // Call Web Service Operation
            if (port != null) {
                port.updateStudent(arg0, arg1, arg2, arg3);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    }

    /**
     * Invokes the SOAP method deleteStudent
     * @param arg0 resource URI parameter
     */
    @PUT
    @Consumes("text/plain")
    @Path("deletestudent/")
    public void putDeleteStudent(@QueryParam("arg0") String arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                port.deleteStudent(arg0);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    }

    /**
     *
     */
    private StudentWS getPort() {
        try {
            // Call Web Service Operation
            soap_client.StudentWS_Service service = new soap_client.StudentWS_Service();
            soap_client.StudentWS p = service.getStudentWSPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
