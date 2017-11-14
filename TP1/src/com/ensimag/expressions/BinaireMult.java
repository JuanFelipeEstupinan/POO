package com.ensimag.expressions;

public class BinaireMult extends ExpBinaire {
	
	public BinaireMult(ExpAbstraite opGauche, ExpAbstraite opDroit) {
		this.opGauche = opGauche;
		this.opDroit = opDroit;
	}

	@Override
	protected String getOperateur() {
		return "*";
	}

}
