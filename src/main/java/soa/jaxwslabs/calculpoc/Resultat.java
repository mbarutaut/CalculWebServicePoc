package soa.jaxwslabs.calculpoc;

import java.util.HashMap;
import java.util.Map;

public class Resultat {
	

	private Map<Double,Double> valeurPrix;
	private Double sommeValeur;
	
	
	public Resultat() {
		this.valeurPrix = new HashMap<Double, Double>();
	}


	public Resultat(Map<Double, Double> valeurPrix, Double sommeValeur) {
		this.valeurPrix = valeurPrix;
		this.sommeValeur = sommeValeur;
	}


	public Map<Double, Double> getValeurPrix() {
		return valeurPrix;
	}


	public void setValeurPrix(Map<Double, Double> valeurPrix) {
		this.valeurPrix = valeurPrix;
	}


	public Double getSommeValeur() {
		return sommeValeur;
	}


	public void setSommeValeur(Double sommeValeur) {
		this.sommeValeur = sommeValeur;
	}
	
	


	
	
	
	
	

}
