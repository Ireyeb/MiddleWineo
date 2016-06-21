package fr.doranco.wineo.middleware.objetmetier;

import java.math.BigDecimal;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Entrepot {

	private Set<Cave> listeCave;
	private BigDecimal maxBouteille;

	
	//Getter Setter
	
	public Set<Cave> getListeCave() {

		return listeCave;
	}

	public void setListeCave(Set<Cave> listeCave) {
		this.listeCave = listeCave;
	}

	public BigDecimal getMaxBouteille() {
		return maxBouteille;
	}

	public void setMaxBouteille(BigDecimal maxBouteille) {
		this.maxBouteille = maxBouteille;
	}

	// ToString HashCode Equals

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("Liste Caves", listeCave)
				.append("nombre max de bouteille", maxBouteille)
				.build();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.listeCave)
				.append(this.maxBouteille)
				.build();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (this == obj)
			return true;

		Entrepot autre = (Entrepot) obj;

		return new EqualsBuilder()
				.append(this.listeCave, autre.listeCave)
				.append(this.maxBouteille, autre.maxBouteille)
				.build();
	}

}
