package variantenmuster.strategie;

/**
 * Dieses Interface definiert eine Familie von Sortieralgorithmen
 * und ist Bestandteil des Strategie Entwurfsmusters (engl. strategy pattern).
 * 
 * @author Simon
 */
public interface SortierAlgorithmus {
	
	/**
	 * Sortiert die Zahlen eines gegebenen Arrays und liefert das sortierte Array zur�ck.
	 * @param zahlen die Zahlen, die sortiert werden sollen.
	 * @return liefert das sortierte Array zur�ck.
	 */
	public int[] sortiere(int[] zahlen);
	
	public String getName();
	
}
