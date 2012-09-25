package zustandshandhabungsmuster.memento;

import java.util.ArrayList;

/**
 * Rolle: Aufbewahrer (engl. Caretaker)
 * Das Objekt das weiss wann und warum sich der Urheber speichern
 * oder wiederherstellen muss.
 * 
 * @author Simon
 */
public class Aufbewahrer {
	private ArrayList<Memento> savedStates = new ArrayList<Memento>();

	public void addMemento(Memento m) {
		savedStates.add(m);
	}

	public Memento getMemento(int index) {
		return savedStates.get(index);
	}
}
