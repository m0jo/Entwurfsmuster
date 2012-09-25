package variantenmuster.schablonenmethode;

/**
 * Schablenenmethode Entwurfsmuster (engl. template method)
 * Beispielausgabe auf der Konsole...
 * 
 * @author Simon
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Getraenk kaffee = new Kaffee();
		Getraenk tee = new Tee();
		
		kaffee.rezeptZubereiten();
		tee.rezeptZubereiten();
		
	}

}
