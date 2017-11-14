package com.ensimag.expressions;

public class Constante extends ExpAbstraite {
	
	private double valeur;
	
	public Constante(double valeur) {
		this.valeur = valeur;
	}

	@Override
	public String toStringInfixe() {
		return String.valueOf(this.valeur);
	}

	public double getValeur() {
		return valeur;
	}

}
