package variantenmuster.strategie;

/**
 * Insertionsort Implementierung
 * 
 * konkrete Strategie
 */
public class InsertionSort implements SortierAlgorithmus {

	@Override
	public int[] sortiere(int[] zahlen) {

		int i, j, newValue;
		for (i = 1; i < zahlen.length; i++) {
			newValue = zahlen[i];
			j = i;
			while (j > 0 && zahlen[j - 1] > newValue) {
				zahlen[j] = zahlen[j - 1];
				j--;
			}
			zahlen[j] = newValue;
		}
		return zahlen;
	}
	
	@Override
	public String getName() {
		return "InsertionSort";
	}

}
