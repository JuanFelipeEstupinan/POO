package com.ensimag.env;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class Env {
	
	HashMap<String, Double> tableauValeurs = new HashMap<>();
	
	public void associer(String nom, double valeur) {
		tableauValeurs.put(nom, valeur);
	}
	
	public double obtenirValeur(String nom) {
		Double valeur = tableauValeurs.get(nom);
		
		if(valeur == null){
			throw new NoSuchElementException("Clé introuvable");
		}
		
		return valeur;
	}

	@Override
	public String toString() {
		// TODO: Implementer methode
		return "Env []";
	}
}
