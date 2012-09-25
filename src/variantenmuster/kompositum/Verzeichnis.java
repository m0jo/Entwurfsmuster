package variantenmuster.kompositum;

import java.util.HashSet;

/**
 * Diese Klasse repr�sentiert Komposita in dem Kompositum-Entwurfsmuster.
 * Sie enth�lt Bl�tter und weitere Komposita.
 * 
 * @author Simon
 */
public class Verzeichnis extends DateisystemKomponente {
	
	private HashSet<DateisystemKomponente> komponente;
	
	
	public Verzeichnis(String name) {
		this.komponente = new HashSet<DateisystemKomponente>();
		this.setName(name);
	}
	
	public HashSet<DateisystemKomponente> getKomponente() {
		return komponente;
	}

	public void setKomponente(HashSet<DateisystemKomponente> komponente) {
		this.komponente = komponente;
	}
	
	@Override
	public String toString() {
		return this.getName() + "/";
	}
	
}
