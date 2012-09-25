package entkopplungsmuster.beobachter;

public class KonkreterBeobachter extends Beobachter {

	public KonkretesSubjekt sub = new KonkretesSubjekt();

	public int zustand;

	@Override
	public void aktualisiere() {

		zustand = sub.getZustand();
	}

}
