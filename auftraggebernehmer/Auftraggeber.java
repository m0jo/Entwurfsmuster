package auftraggebernehmer;

public class Auftraggeber implements Runnable {
	DB db;

	public Auftraggeber(DB db) {
		this.db = db;
	}

	@Override
	public void run() {
		while (true) {
			db.put(1 + (int) (Math.random() * ((100 - 1) + 1)));
		}

	}
}
