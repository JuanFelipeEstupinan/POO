package com.ensimag.expressions;

import com.ensimag.env.Env;

public class Constante extends ExpAbstraite {
	
	private double valeur;
	
	public Constante(double valeur) {
		this.valeur = valeur;
	}
	
	public double getValeur() {
		return this.valeur;
	}

	@Override
	public String toStringInfixe() {
		return String.valueOf(this.valeur);
	}

	@Override
	public double evaluer(Env env) {
		return this.valeur;
	}
	
	

}
