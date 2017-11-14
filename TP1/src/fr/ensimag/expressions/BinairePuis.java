package fr.ensimag.expressions;

import fr.ensimag.env.Env;

public class BinairePuis extends ExpBinaire {

	public BinairePuis(ExpAbstraite opGauche, ExpAbstraite opDroit) {
		this.opGauche = opGauche;
		this.opDroit = opDroit;
	}

	@Override
	protected String getOperateur() {
		return "^";
	}

	@Override
	public double evaluer(Env env) {
		return Math.pow(opGauche.evaluer(env), opDroit.evaluer(env));
	}

}
