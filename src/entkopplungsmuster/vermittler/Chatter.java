package entkopplungsmuster.vermittler;

import java.util.LinkedList;

/**
 * Abstrakter Kollege
 * 
 * @author Simon
 */
public abstract class Chatter {
	
	private Chatroom chatroom;
	
	private String name;
	
	private LinkedList<String> receivedMessages;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chatroom getChatroom() {
		return chatroom;
	}

	public void setChatroom(Chatroom chatroom) {
		this.chatroom = chatroom;
	}

	public LinkedList<String> getReceivedMessages() {
		return receivedMessages;
	}

	public void setReceivedMessages(LinkedList<String> receivedMessages) {
		this.receivedMessages = receivedMessages;
	}
	
}
