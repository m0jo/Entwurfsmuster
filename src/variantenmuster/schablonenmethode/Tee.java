package variantenmuster.schablonenmethode;

/**
 * Konkrete Klasse Tee die von Getraenk erbt und Einschubmethoden überschreibt.
 * 
 * @author Simon
 */
public class Tee extends Getraenk {

	@Override
	public void zutatenVorbereiten() {
		System.out.println("2. Teeblätter schneiden und in Teekanne geben...");
	}

	@Override
	public void aufbruehen() {
		System.out.println("3. Tee aufbrühen...");
	}

}
