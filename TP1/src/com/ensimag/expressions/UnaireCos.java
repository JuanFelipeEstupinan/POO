package com.ensimag.expressions;

public class UnaireCos extends ExpUnaire {

	public UnaireCos(ExpAbstraite operande) {
		this.operande = operande;
	}

	@Override
	protected String getOperateur() {
		return "cos";
	}

}
