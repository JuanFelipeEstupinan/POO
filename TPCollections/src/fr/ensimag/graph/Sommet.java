package fr.ensimag.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Sommet {
	private String etiquette;
	private HashMap<String, Sommet> succeseurs;

	public Sommet(String etiquette) {
		super();
		this.etiquette = etiquette;
		this.succeseurs = new HashMap<>();
	}

	public Sommet(String etiquette, HashMap<String, Sommet> succeseurs) {
		super();
		this.etiquette = etiquette;
		this.succeseurs = succeseurs;
	}

	public void addSucceseur(Sommet sommet) {
		this.succeseurs.put(sommet.getEtiquette(), sommet);
	}

	public String listeSucceseurs() {
		String succeseurs = "";
		ArrayList<Sommet> listeSucceseurs = new ArrayList<Sommet>(this.succeseurs.values());
		for (Sommet s : listeSucceseurs) {
			succeseurs += "(" + this.etiquette + ", " + s.etiquette + ")";
			if (listeSucceseurs.indexOf(s) < (listeSucceseurs.size() - 1)) {
				succeseurs += ", ";
			}
		}
		return succeseurs;
	}

	public String getEtiquette() {
		return etiquette;
	}

	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
	}

	public HashMap<String, Sommet> getSucceseurs() {
		return succeseurs;
	}

	public void setSucceseurs(HashMap<String, Sommet> succeseurs) {
		this.succeseurs = succeseurs;
	}

}
