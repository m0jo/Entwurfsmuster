package entkopplungsmuster.adapter;

public class Adapter implements Ziel {

	@Override
	public void operation() {
		System.out.println("implementierte methode");
		Dienst dienst = new Dienst();
		dienst.service();
		
	}
	
	
	
}
