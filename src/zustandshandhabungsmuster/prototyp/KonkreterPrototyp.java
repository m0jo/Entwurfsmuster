package zustandshandhabungsmuster.prototyp;

public class KonkreterPrototyp extends Prototyp {
	
	private int number;
	
	
	public KonkreterPrototyp(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printNumber() {
		System.out.println("Number: " + number);
	}
}
