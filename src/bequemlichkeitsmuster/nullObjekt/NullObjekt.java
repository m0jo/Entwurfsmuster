package bequemlichkeitsmuster.nullObjekt;

/**
 * Das Null-Objekt Entwurfsmuster implementiert zusätzlich als Einzelstück.
 * Methoden des Null-Objekts tuen nichts, bei Zugriffen wird aber keine NullPointerException geworfen.
 * if Abfragen ob ein Objekt einer Unterklasse von AbstraktesObjekt == null ist kann man sich sparen.
 * 
 * @author Simon
 */
public class NullObjekt extends AbstraktesObjekt {
	
	private static final NullObjekt NULL_OBJEKT = new NullObjekt();
	
	private NullObjekt() {}
	
	public NullObjekt getInstance() {
		return NULL_OBJEKT;
	}
	
	@Override
	public void anfrage() {
		// tue nichts :-)
	}

}
