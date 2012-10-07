package auftraggebernehmer;

import javax.swing.JFrame;


public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DB db = new DB();
		Auftraggeber geb = new Auftraggeber(db);
		Auftragnehmer nehm = new Auftragnehmer(db);
		Measure me = new Measure(db);

		Thread poster = new Thread(geb);
		Thread poster2 = new Thread(geb);
		Thread puller = new Thread(nehm);
		Thread puller2 = new Thread(nehm);
		Thread puller3 = new Thread(nehm);
		Thread measure = new Thread(me);

		poster.start();
		// poster2.start();

		puller.start();
		// puller2.start();
		// puller3.start();

		JFrame frame = new JFrame("ratio");
		frame.getContentPane().add(me);
		frame.setVisible(true);
		frame.setVisible(true);
		frame.setSize(200, 200);

		measure.start();
	}

}
