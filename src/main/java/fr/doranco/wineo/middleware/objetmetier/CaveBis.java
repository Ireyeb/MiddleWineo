package fr.doranco.wineo.middleware.objetmetier;

import java.util.Map;
import java.util.UUID;

public class CaveBis {

	private Map<String, Bouteille> bouteilles;
	private Integer capaciteMax;
	private UUID reference;
	private String proprietaire;
	
	//constructeur
	public CaveBis() {
		super();
	}
	
	//getter Setter
	
	public Map<String, Bouteille> getBouteilles() {
		return bouteilles;
	}
	public void setBouteilles(Map<String, Bouteille> bouteilles) {
		this.bouteilles = bouteilles;
	}
	public Integer getCapaciteMax() {
		return capaciteMax;
	}
	public void setCapaciteMax(Integer capaciteMax) {
		this.capaciteMax = capaciteMax;
	}
	public UUID getReference() {
		return reference;
	}
	public void setReference(UUID reference) {
		this.reference = reference;
	}
	public String getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	
}
