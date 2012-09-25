package variantenmuster.schablonenmethode;

/**
 * Schablenenmethode Entwurfsmuster (engl. template method)
 * 
 * @author Simon
 */
public abstract class Getraenk {
	
	/** Schablonenmethode */
	public void rezeptZubereiten() {
		kocheWasser();
		zutatenVorbereiten();
		aufbruehen();
		inTasseEinfuellen();
	}
	
	/** fest definierte Einschubmetthode */
	public void kocheWasser() {
		System.out.println("\n1. Wasser kochen...");
	}
	
	/** abstrakte Einschubmethode für Unterklassen */
	public abstract void zutatenVorbereiten();
	
	/** abstrakte Einschubmethode für Unterklassen */
	public abstract void aufbruehen();
	
	/** fest definierte Einschubmetthode */
	public void inTasseEinfuellen() {
		System.out.println("4. Getränk in eine Tasse einfüllen...");
	}
	
}
