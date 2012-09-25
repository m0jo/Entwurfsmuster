package variantenmuster.kompositum;

import java.util.HashSet;

/**
 * Diese Klasse repräsentiert Blätter in dem Kompositum-Entwurfsmuster.
 * Das Blatt ist ein Einzelobjekt und besitzt keine Kindobjekte.
 * 
 * @author Simon
 */
public class Datei extends DateisystemKomponente {
	
	private String dateiEndung;
	
	
	public Datei(String name, String dateiEndung) {
		this.dateiEndung = dateiEndung;
		this.setName(name);
	}
	
	public String getDateiEndung() {
		return dateiEndung;
	}

	public void setDateiEndung(String dateiEndung) {
		this.dateiEndung = dateiEndung;
	}
	
	@Override
	public String toString() {
		return this.getName() + this.dateiEndung;
	}

	@Override
	public HashSet<DateisystemKomponente> getKomponente() {
		return null;
	}
	
}
