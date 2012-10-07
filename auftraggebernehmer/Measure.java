package auftraggebernehmer;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Measure extends JPanel implements Runnable {

	DB db;
	int size = 0;
	int preSize = 0;
	int[] ratio;

	public Measure(DB db) {
		this.db = db;

	}

	@Override
	public void run() {
		while (true) {
			ratio = db.getRatio();
			size = db.getSize();

			repaint();

		}

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.GRAY);
		g.drawString("Reads: " + ratio[0], 50, 50);
		g.drawString("Writes: " + ratio[1], 50, 90);
		g.drawString("-------------------", 50, 110);
		g.drawString("Size: " + size, 50, 130);

	}

}
