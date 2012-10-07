package beobachter;

public class KonkretesSubjekt extends Subjekt {

	Zustand subjektZustand;
	
	public Zustand gibZustand(){
		return subjektZustand;
	}
	
	public void setzeZustand(Zustand z){
		subjektZustand = z;
		benachrichtige();
	}
}
