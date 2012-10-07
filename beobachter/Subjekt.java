package beobachter;

import java.util.LinkedList;

public class Subjekt {
	LinkedList<Beobachter> beobachter = new LinkedList<Beobachter>();

	public void meldeAn(Beobachter b){
		beobachter.add(b);
	}
	public void meldeAb(Beobachter b){
		beobachter.remove(b);
	}
	
	public void benachrichtige(){
		for(Beobachter b : beobachter){
			b.aktualisiere();
		}
	}
}
