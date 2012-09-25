package zustandshandhabungsmuster.einzelstueck;

/**
 * 
 * @author Simon
 */
public class SingletonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Einzelstück wird nur einmal erzeugt und getInstance() liefert immer das gleiche Objekt...
		 */
		
		// Lazy-Creation (Erzeugung erst wenn benötigt)
		SingletonLazy einzelstueckLazy1 = SingletonLazy.getInstance();
		einzelstueckLazy1.setName("Aisenberg");
		System.out.println(einzelstueckLazy1.getName());
		
		SingletonLazy einzelstueckLazy2 = SingletonLazy.getInstance();
		System.out.println(einzelstueckLazy2.getName());
		
		// Eager-Creation (Erzeugung bei Initialisierung der Klasse)
		SingletonEager einzelstueckEager1 = SingletonEager.getInstance();
		einzelstueckEager1.setName("lalala");
		System.out.println(einzelstueckEager1.getName());
		
		SingletonEager einzelstueckEager2 = SingletonEager.getInstance();
		System.out.println(einzelstueckEager2.getName());
		
	}

}
