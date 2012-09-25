package zustandshandhabungsmuster.memento;

/**
 * Beispielklasse zur Veranschaulichung des Entwurfsmusters.
 * 
 * @author Simon
 */
public class MainExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Aufbewahrer wird erzeugt
		Aufbewahrer aufbewahrer = new Aufbewahrer();
		
		/* Urheber wird erzeugt und setzt immer seinen aktuellen Status
		 * 
		 * Aufbewahrer speichert diesen zu einem bestimmten Zeitpunkt
		 * in einem Memento und bewahrt ihn auf.
		 */
		Urheber urheber = new Urheber();
		urheber.set("State1");
		urheber.set("State2");
		aufbewahrer.addMemento(urheber.saveToMemento());
		urheber.set("State3");
		aufbewahrer.addMemento(urheber.saveToMemento());
		urheber.set("State4");
		
		// Wiederherstellung des alten Zustands
		urheber.restoreFromMemento(aufbewahrer.getMemento(1));
	}

}
