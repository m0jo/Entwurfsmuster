package entkopplungsmuster.vermittler;

import java.util.LinkedList;

/**
 * Konkreter Kollege
 * 
 * @author Simon
 */
public class OneToAllChatter extends Chatter {
	
	public OneToAllChatter(String name, Chatroom chatroom) {
		this.setReceivedMessages(new LinkedList<String>());
		this.setName(name);
		chatroom.getChatter().add(this);
		this.setChatroom(chatroom);
	}
	
	public void sendMessage(String message) {
		this.getChatroom().transferMessage(message);
	}
	
}
