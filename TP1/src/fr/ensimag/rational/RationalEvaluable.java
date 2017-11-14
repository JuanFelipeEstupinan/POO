package fr.ensimag.rational;

import fr.ensimag.evaluable.Evaluable;

public class RationalEvaluable extends Rational implements Evaluable {

	public RationalEvaluable(int num) {
		super(num);
	}

	public RationalEvaluable(int num, int denom) {
		super(num, denom);
	}
	
	public RationalEvaluable(Rational r) {
		super(r);
	}

	@Override
	public double evaluer() {
		return (double) this.getNum() / this.getDenom();
	}

}
