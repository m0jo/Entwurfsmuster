package entkopplungsmuster.vermittler;

import java.util.HashSet;

/**
 * Konkreter Vermittler
 * 
 * @author Simon
 */
public class OneToAllChatroom extends Chatroom {
	
	
	public OneToAllChatroom() {
		this.setChatter(new HashSet<Chatter>());
	}
	
	@Override
	public void transferMessage(String message) {
		
		for (Chatter chatter : this.getChatter()) {
			chatter.getReceivedMessages().add(message);
		}
		
	}
	
}
