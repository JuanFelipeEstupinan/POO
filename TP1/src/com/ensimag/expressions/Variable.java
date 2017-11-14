package com.ensimag.expressions;

import com.ensimag.env.Env;

public class Variable extends ExpAbstraite {
	
	private String nom;
	
	public Variable(String nom) {
		super();
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}

	@Override
	public String toStringInfixe() {
		return this.nom;
	}

	@Override
	public double evaluer(Env env) {
		return env.obtenirValeur(this.nom);
	}

}
