package auftraggebernehmer;

public class Auftragnehmer implements Runnable {
	DB db;

	public Auftragnehmer(DB db) {
		this.db = db;

	}

	@Override
	public void run() {
		while (true) {			
			db.pull();
		}

	}

}
