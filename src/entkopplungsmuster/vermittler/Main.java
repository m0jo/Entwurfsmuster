package entkopplungsmuster.vermittler;

/**
 * Vermittler Entwurfsmuster (engl. mediator pattern)
 * 
 * "Kollegen" kooperieren miteinander über einen "Vermittler".
 * Ein Vermittler kennt alle seine Kollegen.
 * Ein Kollege kennt nur sein Vermittler.
 * 
 * @author Simon
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		OneToAllChatroom chatroom = new OneToAllChatroom();
		
		OneToAllChatter chatter1 = new OneToAllChatter("Hans", chatroom);
		OneToAllChatter chatter2 = new OneToAllChatter("Peter", chatroom);
		OneToAllChatter chatter3 = new OneToAllChatter("Julia", chatroom);
		
		/* 
		 * Nachrichten werden immer an alle im Chatroom geschrieben...
		 * sendMessage() ruft transferMessage() beim Vermittler auf
		 */
		chatter1.sendMessage("Hiho an Alle!");
		chatter2.sendMessage("spam...");
		chatter3.sendMessage("lala");
		
		OneToAllChatter chatter4 = new OneToAllChatter("Bianca", chatroom);
		
		chatter4.sendMessage("bin jetzt auch da...");
		chatter2.sendMessage("sinnlose Nachricht");
		chatter3.sendMessage("absolut sinnlos");
		
		
		// gebe die erhaltenen Nachriten von jedem im Chatroom aus
		for (Chatter chatter : chatroom.getChatter()) {
			System.out.println("messages received by " + chatter.getName());
			for (String message : chatter.getReceivedMessages()) {
				System.out.println(message);
			}
			System.out.println();
		}
		
		
	}

}
