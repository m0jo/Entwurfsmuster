package variantenmuster.strategie;

/**
 * Kontext
 * 
 * @author Simon
 */
public class SortiertesArray {
	
	private SortierAlgorithmus strategie;
	
	private int[] array;
	
	public SortiertesArray(int groesse, SortierAlgorithmus strategie) {
		this.array = new int[groesse];
		this.strategie = strategie;
	}
	
	/**
	 * wenn zu viel eingef�gt wird f�llt die erste Stelle immer raus... ;-)
	 * Und funktioniert nur f�r positive Zahlen.
	 * 
	 * Aber das ist ja auch nur zum Entwurfsmuster testen ;-)
	 */
	public void add(int zahl) {
		array[0] = zahl;
		// sortiere array anhand gew�hlter Strategie
		array = strategie.sortiere(array);
	}
	
	public int[] getArray() {
		return this.array;
	}
	
}
