package zustandshandhabungsmuster.prototyp;

/**
 * Prototyp Entwurfsmuster (engl. prototype design pattern)
 * Neue Instanzen werden aus Kopiien vorhandener prototypischer Instanzen (Vorlagen) erzeugt und angepasst.
 * 
 * @author Simon
 */
public class Main {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Prototyp prototyp = new KonkreterPrototyp(100);
		
		/*
		 * Das prototyp Objekt wird 10 mal geklont und ver�ndert.
		 * Es handelt sich jedes mal um eine echte Kopie des Objekts.
		 * Ver�nderungen der Kopie beeinflussen das urspr�ngliche Objekt nicht.
		 */
		for (int i = 1; i <= 10; i++) {
			Prototyp temp = prototyp.clone();
			temp.setNumber(temp.getNumber() * i);
			temp.printNumber();
		}
		
	}

}
