package variantenmuster.strategie;

/**
 * Selectionsort Implementierung
 * 
 * konkrete Strategie
 */
public class SelectionSort implements SortierAlgorithmus {
	
	@Override
	public int[] sortiere(int[] zahlen) {

		for (int i = 0; i < zahlen.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < zahlen.length; j++) {
				if (zahlen[minIndex] > zahlen[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = zahlen[i];
				zahlen[i] = zahlen[minIndex];
				zahlen[minIndex] = temp;
			}
		}

		return zahlen;

	}

	@Override
	public String getName() {
		return "SelectionSort";
	}

}
