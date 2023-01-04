package ay32_yh87.chatApp.model;

import java.util.Set;
import java.util.UUID;

import common.connector.INamedConnector;
import provided.pubsubsync.IPubSubSyncManager;

/**
 * adapter from main model to main view.
 * @author jimmy
 *
 */
public interface IMainModelToViewAdptr {

	/**
	 * Update the connector list.
	 * @param connectedUsersSet The connectors list for updating
	 */
	public void updateConnectorList(Set<INamedConnector> connectedUsersSet);

	/**
	 * @param msg the message send to the invited user.
	 * @return whether the user will join.
	 */
	public boolean confirmToJoin(String msg);

	/**
	 * A  method to create a new mini-controller
	 * @param chatRoomName the chatroom name.
	 * @param pssManager the manager for the chatroom.
	 * @param myNamedConnector the connector stub.
	 * @param chatRoomID the id for the chatroom
	 * @return the IMainModelToMiniMVCAdptr to represent the chatroom.
	 */
	public IMainModelToMiniMVCAdptr makeMiniMVC(String chatRoomName, IPubSubSyncManager pssManager,
			INamedConnector myNamedConnector, UUID chatRoomID);

	/**
	 * select the chatroom with the specific id.
	 * @param RoomID The room id.
	 */
	public void selectMiniMVC(UUID RoomID);

	/**
	 * remove the chatroom with id.
	 * @param roomID the room id.
	 */
	public void removeMiniMVC(UUID roomID);
}
