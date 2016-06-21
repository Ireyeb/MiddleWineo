package fr.doranco.wineo.middleware.objetmetier;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Recompense {

	private String nom;
	private Integer annee;
	private BigDecimal valeur;
	
	//Constructeurs
	
	public Recompense() {
		super();
	}

	public Recompense(String nom, Integer annee, BigDecimal valeur) {
		super();
		this.nom = nom;
		this.annee = annee;
		this.valeur = valeur;
	}

	
	//Getter Setter
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public BigDecimal getValeur() {
		return valeur;
	}

	public void setValeur(BigDecimal valeur) {
		this.valeur = valeur;
	}
	
	
	
	//String HashCode Equals
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("nom", nom)
				.append("valeur", valeur)
				.append("valeur", valeur)
				.build();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.annee)
				.append(this.nom)
				.append(this.valeur)
				.build();
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		
		if (this == obj)
			return true;
		
		Recompense autre = (Recompense) obj;
		
		return new EqualsBuilder()
				.append(this.annee, autre.annee)
				.append(this.nom, autre.nom)
				.append(this.valeur, autre.valeur)
				.build();
		
	}
	
	@Override
	public Recompense clone(){
		
		Recompense clone = new Recompense();
		
		clone.annee = this.annee;
		clone.nom = this.nom;
		clone.valeur = new BigDecimal(valeur.toPlainString());
		
		return clone;
	}
	
}
