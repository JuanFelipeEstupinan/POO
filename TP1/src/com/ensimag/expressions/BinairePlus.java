package com.ensimag.expressions;

public class BinairePlus extends ExpBinaire {

	public BinairePlus(ExpAbstraite opGauche, ExpAbstraite opDroit) {
		this.opGauche = opGauche;
		this.opDroit = opDroit;
	}

	@Override
	protected String getOperateur() {
		return "+";
	}
	
	
}
