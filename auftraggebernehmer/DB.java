package auftraggebernehmer;
import java.util.LinkedList;

public class DB {
	LinkedList<Integer> db = new LinkedList<Integer>();
	int read = 1;
	int write = 1;

	public synchronized void put(int e) {

		// Queue mit größe 100 simulieren
		/*
		 * if (db.size() > 100) { try { wait(); } catch (InterruptedException
		 * e1) { e1.printStackTrace(); } }
		 */
		System.out.println("<< " + e);

		db.add(e);
		write++;
		notifyAll();
	}

	public synchronized int pull() {
		if (db.size() <= 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		int e = db.getFirst();
		db.removeFirst();
		System.out.println(">> " + e);
		read++;
		notifyAll();
		return e;
	}

	public synchronized int getSize() {
		return db.size();
	}

	public int[] getRatio() {
		int[] ratio = new int[2];
		ratio[0] = read;
		ratio[1] = write;

		return ratio;
	}
}
