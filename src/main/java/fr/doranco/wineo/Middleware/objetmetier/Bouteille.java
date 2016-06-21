package fr.doranco.wineo.middleware.objetmetier;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Bouteille {

	private String reference;
	private Double contenance;
	private String designation;
	private Integer annee;
	private Recompenses recompense;
	
	//Constructeurs
	
	public Bouteille() {
		super();
	}


	public Bouteille(String reference, Double contenance, String designation, Integer annee, Recompenses recompense) {
		super();
		this.reference = reference;
		this.contenance = contenance;
		this.designation = designation;
		this.annee = annee;
		this.recompense = recompense;
	}
	
	
	//Getter Setter
	
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Double getContenance() {
		return contenance;
	}

	public void setContenance(Double contenance) {
		this.contenance = contenance;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer année) {
		this.annee = année;
	}

	public Recompenses getRecompense() {
		return recompense;
	}

	public void setRecompense(Recompenses recompense) {
		this.recompense = recompense;
	}
	
	
	//ToString HashCode Equals

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("Reference", reference)
				.append("Designation", designation)
				.append("Contenance", contenance)
				.append("Année", annee)
				.append("Récompenses", recompense)
				.build();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.annee)
				.append(this.contenance)
				.append(this.designation)
				.append(this.recompense)
				.append(this.reference)
				.build();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (this == obj)
			return true;
		
		Bouteille autre = (Bouteille) obj;
		
		return new EqualsBuilder()
				.append(this.annee, autre.annee)
				.append(this.contenance, autre.contenance)
				.append(this.designation, autre.designation)
				.append(this.recompense, autre.recompense)
				.append(this.reference, autre.reference)
				.build();
	}
	
}
