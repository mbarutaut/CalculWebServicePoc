package soa.jaxwslabs.calculpoc;

import javax.jws.WebService;


@WebService(name = "CalculService", targetNamespace="http://soa.jaxwslabs.calculpoc")
public interface CalculService {
	
	Double getResultat();

}
