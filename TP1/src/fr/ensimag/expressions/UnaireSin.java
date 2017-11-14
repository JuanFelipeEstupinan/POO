package fr.ensimag.expressions;

import fr.ensimag.env.Env;

public class UnaireSin extends ExpUnaire {
	
	public UnaireSin(ExpAbstraite operande) {
		this.operande = operande;
	}

	@Override
	protected String getOperateur() {
		return "sin";
	}
	
	@Override
	public double evaluer(Env env) {
		return Math.sin(operande.evaluer(env));
	}
}
