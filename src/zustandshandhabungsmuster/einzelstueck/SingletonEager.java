package zustandshandhabungsmuster.einzelstueck;

/**
 * Das Einzelst�ck Entwurfsmuster (engl. Singleton Pattern).
 * Die Instanz wird bei der Initialisierung dieser Klasse erzeugt (Eager Creation).
 * 
 * Lesezugriffe ben�tigen keine synchronisierung und sind somit schneller als bei der Lazy-Creation Methode.
 * Thread-sicherheit ist auch gew�hrleistet.
 * 
 * @author Simon
 */
public class SingletonEager {
	
	/** INSTANCE speichert das Einzelst�ck dieser Klasse. */
	private static final SingletonEager INSTANCE = new SingletonEager();
	
	/** Der Konstruktor ist privat */
	private SingletonEager() {
	}
	
	/** Liefert die einzige Instanz dieser Klasse (Einzelst�ck) zur�ck. */
	public static SingletonEager getInstance() {
		return INSTANCE;
	}
	
	
	/** Klassenattribut name (nur zum testen...) */
	private String name;
	
	/** getter name */
	public String getName() {
		return name;
	}
	
	/** setter name */
	public void setName(String name) {
		this.name = name;
	}
	
}
