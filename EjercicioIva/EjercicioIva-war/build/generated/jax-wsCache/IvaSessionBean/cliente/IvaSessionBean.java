
package cliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IvaSessionBean", targetNamespace = "http://Iva/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IvaSessionBean {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ivaMethod", targetNamespace = "http://Iva/", className = "cliente.IvaMethod")
    @ResponseWrapper(localName = "ivaMethodResponse", targetNamespace = "http://Iva/", className = "cliente.IvaMethodResponse")
    @Action(input = "http://Iva/IvaSessionBean/ivaMethodRequest", output = "http://Iva/IvaSessionBean/ivaMethodResponse")
    public Double ivaMethod(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
