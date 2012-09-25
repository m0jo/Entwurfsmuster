package variantenmuster.strategie;

/**
 * Erstellt ein Array das nach jedem adden eines Elements sich selbst sortiert.
 * Der Sortieralgorithmus wird nach dem Strategie Entwurfsmuster ausgewählt.
 * 
 * @author Simon
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int groesse = 12;
		
		// erstelle "immer-sortierte-arrays" mit unterschiedlicher sortier-Strategie
		SortiertesArray arrayBubble = buildArrayRandom(groesse, new BubbleSort());
		SortiertesArray arrayInsert = buildArrayRandom(groesse, new InsertionSort());
		SortiertesArray arraySelect = buildArrayRandom(groesse, new SelectionSort());
		
		
	}
	
	/**
	 * Build the Array with random numbers
	 * @param groesse
	 */
	private static SortiertesArray buildArrayRandom(int groesse, SortierAlgorithmus strategie) {
		System.out.println("----------------------------------------------------------------");
		System.out.println("Erstelle Array mit " + strategie.getName() + " Strategie!");
		SortiertesArray arr = new SortiertesArray(groesse, strategie);
		int random;
		for (int i = 0; i < groesse; i++) {
			random = (int)(Math.random() * 99);
			System.out.println("adding " + random + "...");
			arr.add(random);
			printArray(arr.getArray());
		}
		
		return arr;
	}
	
	/**
	 * print that shit!!!
	 * @param array
	 */
	private static void printArray(int[] array) {		
		System.out.print("array: ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

}
