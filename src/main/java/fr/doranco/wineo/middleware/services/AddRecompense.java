package fr.doranco.wineo.middleware.services;

import java.math.BigDecimal;

import fr.doranco.wineo.middleware.objetmetier.Recompense;
import fr.doranco.wineo.middleware.objetmetier.Recompenses;

public class AddRecompense {

	private Recompenses listeRecompenses;
	private Recompense newRecompense;
	
	public AddRecompense() {
		super();
	}

	//Ajout d'une recompense dans la liste "Recompenses"
	
	public void ajoutRecompense(){
		
		listeRecompenses.getRecompenseListe().add(newRecompense);
		
		newRecompense = new Recompense();
		
		valeurUpdate(listeRecompenses);
	}
	
	private void valeurUpdate(Recompenses autre){
		
		autre.setValeur(BigDecimal.ZERO);
		
		for (Recompense list : autre.getRecompenseListe()){
			 autre.getValeur().add(list.getValeur());
		}
		
		autre.getValeur().divide(new BigDecimal(autre.getRecompenseListe().size()));
		
	}

	//getter setter
	
	public Recompenses getListeRecompenses() {
		return listeRecompenses;
	}

	public void setListeRecompenses(Recompenses listeRecompenses) {
		this.listeRecompenses = listeRecompenses;
	}

	public Recompense getNewRecompense() {
		return newRecompense;
	}

	public void setNewRecompense(Recompense newRecompense) {
		this.newRecompense = newRecompense;
	}
	
	
}