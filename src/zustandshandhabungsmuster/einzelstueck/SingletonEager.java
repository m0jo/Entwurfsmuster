package zustandshandhabungsmuster.einzelstueck;

/**
 * Das Einzelstück Entwurfsmuster (engl. Singleton Pattern).
 * Die Instanz wird bei der Initialisierung dieser Klasse erzeugt (Eager Creation).
 * 
 * Lesezugriffe benötigen keine synchronisierung und sind somit schneller als bei der Lazy-Creation Methode.
 * Thread-sicherheit ist auch gewährleistet.
 * 
 * @author Simon
 */
public class SingletonEager {
	
	/** INSTANCE speichert das Einzelstück dieser Klasse. */
	private static final SingletonEager INSTANCE = new SingletonEager();
	
	/** Der Konstruktor ist privat */
	private SingletonEager() {
	}
	
	/** Liefert die einzige Instanz dieser Klasse (Einzelstück) zurück. */
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
