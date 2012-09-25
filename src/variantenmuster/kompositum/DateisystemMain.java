package variantenmuster.kompositum;

/**
 * Veranschaulicht die Verwendung des Kompositum-Entwurfsmusters
 * anhand eines virtuellen Dateisystems...
 * 
 * @author Simon
 */
public class DateisystemMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// erzeuge root-Verzeichnis
		Verzeichnis root = new Verzeichnis("");
		
		// erzeuge weitere Verzeichniseinträge (Dateien und Verzeichnisse)
		root.getKomponente().add(new Datei("info", ".txt"));
		root.getKomponente().add(new Datei("index", ".php"));
		root.getKomponente().add(new Datei("asdf", ".mp3"));
		Verzeichnis stuff = new Verzeichnis("stuff");
		root.getKomponente().add(stuff);
		
		Verzeichnis musik = new Verzeichnis("musik");
		stuff.getKomponente().add(musik);
		Verzeichnis filme = new Verzeichnis("filme");
		stuff.getKomponente().add(filme);
		Verzeichnis bilder = new Verzeichnis("bilder");
		stuff.getKomponente().add(bilder);
		
		musik.getKomponente().add(new Datei("dasasd", ".mp3"));
		musik.getKomponente().add(new Datei("vsdvsdv", ".mp3"));
		musik.getKomponente().add(new Datei("nfgnfgn", ".flac"));
		
		filme.getKomponente().add(new Datei("la", ".avi"));
		filme.getKomponente().add(new Datei("li", ".mkv"));
		filme.getKomponente().add(new Datei("lu", ".mp4"));
		
		bilder.getKomponente().add(new Datei("sonne", ".jpg"));
		bilder.getKomponente().add(new Datei("mond", ".png"));
		bilder.getKomponente().add(new Datei("sterne", ".png"));
		
		
		// gebe Verzeichnisbaum aus...
		printFileTree(root, 0);

	}
	
	/**
	 * Gibt rekursiv ein Verzeichnisbaum auf der Konsole aus...
	 * 
	 * @param root Verzeichnis bei dem gestartet werden soll
	 * @param depth initialwert 0
	 */
	private static void printFileTree(DateisystemKomponente root, int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("--");
		}
		System.out.println(" " + root.toString());
		
		if (root instanceof Verzeichnis) {
			++depth;
			for (DateisystemKomponente komponente : root.getKomponente()) {
				printFileTree(komponente, depth);
			}
		}
	}

}
