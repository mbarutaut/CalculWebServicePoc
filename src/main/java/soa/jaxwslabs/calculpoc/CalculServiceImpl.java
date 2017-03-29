package soa.jaxwslabs.calculpoc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.jws.WebService;

@WebService(endpointInterface="soa.jaxwslabs.calculpoc.CalculService", serviceName="CalculService", portName="CalculPort")
public class CalculServiceImpl implements CalculService {
	
	Map<Double,Double> map = new HashMap<Double, Double>();
	
	private Resultat resultat;
	private Double sommeValeur = 0.0;
	
	public CalculServiceImpl() {
		
		map.put(12.0, 3.87);
		map.put(9.0, 2.97);
		map.put(2.0, 3.07);
		map.put(1.0, 4.04);
		
		for(Entry<Double, Double> entry : map.entrySet()) {
			sommeValeur += entry.getKey();
		}
		
		resultat = new Resultat(map, sommeValeur);
		
		
	}

	@Override
	public Double getResultat() {
		
		Double totalValeurPrix = 0.0;
		Double result = 0.0;
		
		for(Entry<Double, Double> entry : resultat.getValeurPrix().entrySet()) {
			
			totalValeurPrix += entry.getKey()*entry.getValue();
		}
		
		result = totalValeurPrix / resultat.getSommeValeur();
		
		return result;
	}

}
