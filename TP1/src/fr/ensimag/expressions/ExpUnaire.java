package fr.ensimag.expressions;

public abstract class ExpUnaire extends ExpAbstraite {

	protected ExpAbstraite operande;	
	
	protected abstract String getOperateur();
	
	@Override
	public String toStringInfixe() {
		String str = this.getOperateur() + "(" + this.operande.toStringInfixe() + ")" ;
		return str;
	}
}
