package variantenmuster.schablonenmethode;

/**
 * Konkrete Klasse Kaffee die von Getraenk erbt und Einschubmethoden �berschreibt.
 * 
 * @author Simon
 */
public class Kaffee extends Getraenk {

	@Override
	public void zutatenVorbereiten() {
		System.out.println("2. Kaffeebohnen mahlen und in Kaffeekanne geben...");
	}

	@Override
	public void aufbruehen() {
		System.out.println("3. Kaffee aufbr�hen...");
	}

}
