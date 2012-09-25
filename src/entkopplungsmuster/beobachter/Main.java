package entkopplungsmuster.beobachter;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		KonkretesSubjekt sub1 = new KonkretesSubjekt();

		KonkreterBeobachter beob1 = new KonkreterBeobachter();
		KonkreterBeobachter beob2 = new KonkreterBeobachter();
		KonkreterBeobachter beob3 = new KonkreterBeobachter();

		sub1.meldeAn(beob1);
		sub1.meldeAn(beob2);
		sub1.meldeAn(beob3);

		beob1.sub = sub1;
		beob2.sub = sub1;
		beob3.sub = sub1;

		beob1.zustand = 2;
		beob2.zustand = -1;
		beob3.zustand = 394394;

		System.out.println("Initial-Zustände der Beobachter: "
				+ beob1.zustand + " " + beob2.zustand + " " + beob3.zustand);

		System.out.println("Setze Zustand für Subjekt und benachrichtige alle Beobachter...");
		sub1.setZustand(3);
		sub1.benachrichtige();
		System.out.println(beob1.zustand + " " + beob2.zustand + " " + beob3.zustand);

		sub1.setZustand(12312);
		sub1.benachrichtige();
		System.out.println(beob1.zustand + " " + beob2.zustand + " " + beob3.zustand);

	}

}
