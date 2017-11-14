package com.ensimag.expressions;

import com.ensimag.env.Env;

public class BinairePlus extends ExpBinaire {

	public BinairePlus(ExpAbstraite opGauche, ExpAbstraite opDroit) {
		this.opGauche = opGauche;
		this.opDroit = opDroit;
	}

	@Override
	protected String getOperateur() {
		return "+";
	}
	
	@Override
	public double evaluer(Env env) {
		return opGauche.evaluer(env) + opDroit.evaluer(env);
	}
}
