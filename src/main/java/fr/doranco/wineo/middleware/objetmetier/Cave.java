package fr.doranco.wineo.middleware.objetmetier;

import java.util.HashSet;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Cave {

	private HashSet<Bouteille> listeBouteille;
	private Integer bouteilleMax;
	private String proprietaire;
	
	
	//Getter Setter
	
	public HashSet<Bouteille> getListeBouteille() {
		return listeBouteille;
	}
	
	public void setListeBouteille(HashSet<Bouteille> listeBouteille) {
		this.listeBouteille = listeBouteille;
	}
	
	public Integer getBouteilleMax() {
		return bouteilleMax;
	}
	
	public void setBouteilleMax(Integer bouteilleMax) {
		this.bouteilleMax = bouteilleMax;
	}
	
	public String getProprietaire() {
		return proprietaire;
	}
	
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	
	//ToString HashCode Equals

		@Override
		public String toString() {
			return new ToStringBuilder(this)
					.append("Liste bouteille", listeBouteille)
					.append("nombre max de bouteille", bouteilleMax)
					.append("proprietaire", proprietaire)
					.build();
		}

		@Override
		public int hashCode() {
			return new HashCodeBuilder()
					.append(this.listeBouteille)
					.append(this.bouteilleMax)
					.append(this.proprietaire)
					.build();
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj == null)
				return false;
			
			if (this == obj)
				return true;
			
			Cave autre = (Cave) obj;
			
			return new EqualsBuilder()
					.append(this.listeBouteille, autre.listeBouteille)
					.append(this.bouteilleMax, autre.bouteilleMax)
					.append(this.proprietaire, autre.proprietaire)
					.build();
		}
}
