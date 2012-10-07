package beobachter;

public class KonkreterBeobachter extends Beobachter{
	Zustand beobachterZustand;
	KonkretesSubjekt subjekt;

	@Override
	public void aktualisiere() {
		beobachterZustand = subjekt.gibZustand();
		
	}

}
