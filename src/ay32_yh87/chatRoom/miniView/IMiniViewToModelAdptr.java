package ay32_yh87.chatRoom.miniView;

/**
 * The view to model adaptor for the mini-mvc(chat room mvc)
 */
public interface IMiniViewToModelAdptr {
	/**
	 * Exit the chat room.
	 */
	void exitChatRoom();

	/**
	 * Send text message to the chat room.
	 * @param text The string text message to be sent.
	 */
	void sendText(String text);

	/**
	 * Send a command to the chat room.
	 */
	void sendNewPage();
}
