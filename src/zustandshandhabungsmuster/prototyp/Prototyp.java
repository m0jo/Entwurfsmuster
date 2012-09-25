package zustandshandhabungsmuster.prototyp;

/**
 * 
 * 
 * @author Simon
 */
public abstract class Prototyp implements Cloneable {
	
	@Override
	public Prototyp clone() throws CloneNotSupportedException {
		return (Prototyp)super.clone();
	}
	
	public abstract void setNumber(int number);
	
	public abstract int getNumber();
	
	public abstract void printNumber();
	
}
