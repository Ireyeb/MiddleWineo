package fr.doranco.wineo.middleware.objetmetier;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Recompenses {
	
	private List<Recompense> recompenseListe;
	private BigDecimal valeur;
	private Recompense recompense;
	
	//Constructeurs
	
	public Recompenses() {
		super();
		
		recompenseListe = new ArrayList<Recompense>();
	}

	public Recompenses(List<Recompense> recompenseListe, BigDecimal valeur, Recompense recompense) {
		super();
		this.recompenseListe = recompenseListe;
		this.valeur = valeur;
		this.recompense = recompense;
		
		recompenseListe = new ArrayList<Recompense>();
	}
	
	
	//Getter Setter

	public List<Recompense> getRecompenseListe() {
		return recompenseListe;
	}
	
	public void setRecompenseListe(List<Recompense> recompenseListe) {
		this.recompenseListe = recompenseListe;
	}
	
	public Recompense getRecompense() {
		return recompense;
	}
	
	public void setRecompense(Recompense recompense) {
		this.recompense = recompense;
	}
	
	public BigDecimal getValeur() {
		return valeur;
	}
	
	public void setValeur(BigDecimal valeur) {
		this.valeur = valeur;
	}
	
	
	//ToString HashCode Equals
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("recompenseListe", recompenseListe)
				.append("valeur", valeur)
				.build();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.recompenseListe)
				.append(this.recompense)
				.append(this.valeur)
				.build();
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		
		if (this == obj)
			return true;
		
		Recompenses autre = (Recompenses) obj;
		
		return new EqualsBuilder()
				.append(this.recompense, autre.recompense)
				.append(this.recompenseListe, autre.recompenseListe)
				.append(this.valeur, autre.valeur)
				.build();
		
	}

}
