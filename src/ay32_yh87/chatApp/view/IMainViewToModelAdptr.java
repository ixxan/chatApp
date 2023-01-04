package ay32_yh87.chatApp.view;

import java.util.UUID;

/**
 * @author jimmy
 * Adapter for the view to model.
 * @param <H> The remoteHost in the connected drop list.
 */
public interface IMainViewToModelAdptr<H> {

	/**
	 * Login to the chatapp with a name.
	 * @param inputName the input name for the user.
	 */
	void login(String inputName);

	/**
	 * Create a new chatroom with name.
	 * @param chatRoomName input string for creating chatroom.
	 */
	void createChatroom(String chatRoomName);

	/**
	 * Invite a host to join the chatroom.
	 * @param chatRoomID chatroom unique id.
	 * @param chatroomName  the chatroom name.
	 * @param remoteHost  the host we want to invite.
	 */
	void invite(UUID chatRoomID, String chatroomName, H remoteHost);

	/**
	 * connect to the host with ip and bound name.
	 * @param RemoteIP the remote ip.
	 * @param BoundName the bound name.
	 */
	void connect(String RemoteIP, String BoundName);

	/**
	 * quit the chatApp.
	 */
	void quit();
}
