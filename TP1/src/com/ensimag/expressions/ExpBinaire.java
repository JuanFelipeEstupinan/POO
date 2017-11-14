package com.ensimag.expressions;

public abstract class ExpBinaire extends ExpAbstraite {
	
	protected ExpAbstraite opGauche;
	protected ExpAbstraite opDroit;
	
	protected abstract String getOperateur();
	
	@Override
	public String toStringInfixe() {
		String str = "(" + this.opGauche.toStringInfixe() + " " + this.getOperateur() + " " + this.opDroit.toStringInfixe() + ")";
		return str;
	}

}
