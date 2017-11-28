package fr.ensimag.graph;

import java.util.HashMap;
import java.util.Map;

public class GrapheSuccesseurs implements Graphe {

	private HashMap<String, Sommet> sommets;

	
	public GrapheSuccesseurs() {
		super();
		this.sommets = new HashMap<>();
	}
	public GrapheSuccesseurs(HashMap<String, Sommet> sommets) {
		super();
		this.sommets = sommets;
	}

	@Override
	public void ajouteSommet(String label) {
		if (!this.sommets.containsKey(label)) {
			this.sommets.put(label, new Sommet(label));
		} else {
			System.out.println("Il existe déjà un sommet avec cette étiquette");
		}
	}

	@Override
	public void ajouteArc(String labelDepart, String labelArrivee) {
		if (this.sommets.containsKey(labelDepart) && this.sommets.containsKey(labelArrivee)) {
			this.sommets.get(labelDepart).addSucceseur(this.sommets.get(labelArrivee));
		} else {
			System.out.println("Sommet pas trouvé");
		}
	}

	@Override
	public boolean existeChemin(String labelDepart, String labelArrivee) {
		if(this.sommets.containsKey(labelDepart) && this.sommets.containsKey(labelArrivee)) {
			
			
			if (this.sommets.get(labelDepart).getSucceseurs().get(labelArrivee) != null) {
				return true;
			} else {
				for(String label : this.sommets.get(labelDepart).getSucceseurs().keySet()) {
					if (existeChemin(label, labelArrivee)) {
						return true;
					}
				}
				return false;
			}
			
			
		} else {
			System.out.println("Sommet pas trouvé");
			return false;
		}
	}

	@Override
	public String toString() {
		String sommets = "Liste de sommets:\n";
		String arcs = "Liste d'arcs:\n";
		
		for (Map.Entry<String, Sommet> sommet : this.sommets.entrySet()) {
		    sommets += sommet.getKey() + "\n";
		    arcs += sommet.getValue().listeSucceseurs() + "\n";
		}
		return sommets + arcs;
	}

}
