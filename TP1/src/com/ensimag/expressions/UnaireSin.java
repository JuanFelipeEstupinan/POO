package com.ensimag.expressions;

public class UnaireSin extends ExpUnaire {
	
	public UnaireSin(ExpAbstraite operande) {
		this.operande = operande;
	}

	@Override
	protected String getOperateur() {
		return "sin";
	}
}
