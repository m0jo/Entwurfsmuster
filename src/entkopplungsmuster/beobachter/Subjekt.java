package entkopplungsmuster.beobachter;

import java.util.LinkedList;

public class Subjekt {

	LinkedList<Beobachter> beoList = new LinkedList<Beobachter>();

	public void meldeAn(Beobachter b) {
		beoList.add(b);
	}

	public void meldeAb(Beobachter b) {
		beoList.remove(b);
	}

	public void benachrichtige() {
		for (Beobachter beb : beoList) {
			beb.aktualisiere();
		}
	}
}
