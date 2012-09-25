package zustandshandhabungsmuster.memento;

/**
 * Rolle Urheber (engl. Originator)
 * Das Objekt das weiss wie es sich selbst speichern und wiederherstellen kann.
 * 
 * @author Simon
 */
public class Urheber {
	private String state;

	/*
	 * lots of memory consumptive private data that is not necessary to define
	 * the state and should thus not be saved. Hence the small memento object.
	 */

	public void set(String state) {
		System.out.println("Urheber: setze Status auf " + state);
		this.state = state;
	}

	public Memento saveToMemento() {
		System.out.println("Urheber: Speichere Status in Memento.");
		return new Memento(state);
	}

	public void restoreFromMemento(Memento m) {
		state = m.getSavedState();
		System.out.println("Urheber: Status nach der Wiederherstellung aus Memento: "
				+ state);
	}
}
