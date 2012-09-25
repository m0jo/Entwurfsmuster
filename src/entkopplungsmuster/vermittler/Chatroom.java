package entkopplungsmuster.vermittler;

import java.util.HashSet;

/**
 * Abstrakter Vermittler
 * 
 * @author Simon
 */
public abstract class Chatroom {
	
	private HashSet<Chatter> chatter;

	
	public HashSet<Chatter> getChatter() {
		return chatter;
	}

	public void setChatter(HashSet<Chatter> chatter) {
		this.chatter = chatter;
	}
	
	public abstract void transferMessage(String message);
	
}
