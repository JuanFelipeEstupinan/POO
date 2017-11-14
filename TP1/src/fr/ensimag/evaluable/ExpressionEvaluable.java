package fr.ensimag.evaluable;

import fr.ensimag.env.Env;
import fr.ensimag.expressions.ExpAbstraite;

public class ExpressionEvaluable implements Evaluable {

	private ExpAbstraite expAbs;
	private Env env;
	
	public ExpressionEvaluable(ExpAbstraite expAbs, Env env) {
		super();
		this.expAbs = expAbs;
		this.env = env;
	}

	@Override
	public double evaluer() {
		return expAbs.evaluer(env);
	}
	
	@Override
	public String toString() {
		return expAbs.toStringInfixe();
	}

}
