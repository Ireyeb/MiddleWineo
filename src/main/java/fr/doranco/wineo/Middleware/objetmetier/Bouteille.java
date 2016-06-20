package fr.doranco.wineo.Middleware.objetmetier;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Bouteille {

	private String reference;
	private Double contenance;
	private String designation;
	private Integer annee;
	private Recompense recompense;
	
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

	/*public Recompense getRecompense() {
		return recompense;
	}

	public void setRecompense(Recompense recompense) {
		this.recompense = recompense;
	}*/
	
	

	

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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((annee == null) ? 0 : annee.hashCode());
		result = prime * result + ((contenance == null) ? 0 : contenance.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((recompense == null) ? 0 : recompense.hashCode());
		result = prime * result + ((reference == null) ? 0 : reference.hashCode());
		return result;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bouteille other = (Bouteille) obj;
		if (annee == null) {
			if (other.annee != null)
				return false;
		} else if (!annee.equals(other.annee))
			return false;
		if (contenance == null) {
			if (other.contenance != null)
				return false;
		} else if (!contenance.equals(other.contenance))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (recompense == null) {
			if (other.recompense != null)
				return false;
		} else if (!recompense.equals(other.recompense))
			return false;
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
			return false;
		return true;
	}
	
}
