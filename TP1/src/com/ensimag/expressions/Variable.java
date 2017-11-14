package com.ensimag.expressions;

public class Variable extends ExpAbstraite {
	
	private String nom;
	
	public Variable(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public String toStringInfixe() {
		return this.nom;
	}

	public String getNom() {
		return nom;
	}
}
