
package PaneelGen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WS-Interface", targetNamespace = "wsdlPaneel")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSInterface {


    /**
     * 
     * @param request
     * @return
     *     returns PaneelGen.Response
     * @throws Error_Exception
     */
    @WebMethod
    @WebResult(name = "PaneelResp", targetNamespace = "PaneelStorageResp", partName = "response")
    public Response storePaneel(
        @WebParam(name = "PaneelReq", targetNamespace = "PaneelStorageReq", partName = "request")
        Request request)
        throws Error_Exception
    ;

}