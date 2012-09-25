package zustandshandhabungsmuster.memento;

/**
 * Rolle: Memento
 * Das Objekt, in das der urheber seinen aktuellen Zustand speichert
 * und aus dem er seinen alten Zustand liest.
 * Der Aufbewahrer enthält eine Menge von Memento Objekten.
 * 
 * @author Simon
 */
public class Memento {
	private String state;

	public Memento(String stateToSave) {
		state = stateToSave;
	}

	public String getSavedState() {
		return state;
	}
}
