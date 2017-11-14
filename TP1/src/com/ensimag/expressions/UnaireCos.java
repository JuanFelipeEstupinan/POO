package com.ensimag.expressions;

import com.ensimag.env.Env;

public class UnaireCos extends ExpUnaire {

	public UnaireCos(ExpAbstraite operande) {
		this.operande = operande;
	}

	@Override
	protected String getOperateur() {
		return "cos";
	}
	
	@Override
	public double evaluer(Env env) {
		return Math.cos(operande.evaluer(env));
	}

}
