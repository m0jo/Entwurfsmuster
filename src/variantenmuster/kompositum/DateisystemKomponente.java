package variantenmuster.kompositum;

import java.util.HashSet;

/**
 * Diese abstrakte Klasse repräsentiert Komponenten in dem Kompositum-Entwurfsmuster.
 * Sie definiert das gemeinsame Verhalten aller Teilnehmer.
 * 
 * @author Simon
 */
public abstract class DateisystemKomponente {
	
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract HashSet<DateisystemKomponente> getKomponente();
	
}
