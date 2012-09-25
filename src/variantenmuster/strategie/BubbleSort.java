package variantenmuster.strategie;

/**
 * BubbleSort Implementierung
 * 
 * konkrete Strategie
 */
public class BubbleSort implements SortierAlgorithmus {
	
	@Override
	public int[] sortiere(int[] zahlen) {
		
		boolean check = false;
		while (!check) {
			check = true;
			for (int i = 0; i < zahlen.length - 1; i++) {
				int a = zahlen[i];
				int b = zahlen[i+1];
				if (a > b) {
                    zahlen[i+1] = a;
                    zahlen[i] = b;
                    check = false;
                }
			}
		}
		return zahlen;
		
	}
	
	@Override
	public String getName() {
		return "BubbleSort";
	}
	
}
