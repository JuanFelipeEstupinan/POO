package fr.ensimag.expressions;

import fr.ensimag.env.Env;

public class UnaireExp extends ExpUnaire {

	public UnaireExp(ExpAbstraite operande) {
		this.operande = operande;
	}

	@Override
	protected String getOperateur() {
		return "exp";
	}
	
	@Override
	public double evaluer(Env env) {
		return Math.exp(operande.evaluer(env));
	}

}
