package zustandshandhabungsmuster.einzelstueck;

/**
 * Das Einzelstück Entwurfsmuster (engl. Singleton Pattern).
 * Die Instanz wird erst erzeugt, wenn sie zum ersten mal gebraucht wird (Lazy Creation).
 * 
 * Der Nachteil der Lazy-Creation Methode ist, dass nach der ersten Instanziierung jeder Lesezugriff
 * synchronisiert ist und sich mehrere gleichzeitig zugreifende Threaads blockieren.
 * 
 * @author Simon
 */
public class SingletonLazy {
	
	/** instance speichert das Einzelstück dieser Klasse. */
	private static SingletonLazy instance;
	
	/** Der Konstruktor ist privat und wird nur von getInstance() verwendet. */
	private SingletonLazy() {
	}
	
	/**
	 * Liefert die einzige Instanz dieser Klasse (Einzelstück) zurück.
	 * Ist synchronisiert und somit thread-sicher.
	 */
	public synchronized static SingletonLazy getInstance() {
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
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
