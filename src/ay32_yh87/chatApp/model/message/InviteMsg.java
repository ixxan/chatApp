package ay32_yh87.chatApp.model.message;

import java.util.UUID;

import common.connector.messages.IInviteMsg;

/**
 * @author jimmy
 * The invite message class.
 */
public class InviteMsg implements IInviteMsg {

	/**
	 * Serial ID.
	 */
	private static final long serialVersionUID = 3113111964908485469L;

	/**
	 * The chatroomID.
	 */
	private UUID chatroomID;

	/**
	 * The chatroom name.
	 */
	private String chatroomName;

	/**
	 * The constructor for the invite message.
	 * @param chatroomID the input room id.
	 * @param chatroomName the input chatroomname.
	 */
	public InviteMsg(UUID chatroomID, String chatroomName) {
		this.chatroomID = chatroomID;
		this.chatroomName = chatroomName;
	}

	@Override
	public UUID getUUID() {
		return this.chatroomID;
	}

	@Override
	public String getFriendlyName() {
		return this.chatroomName;
	}

}
