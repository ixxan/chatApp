/**
 * 
 */
/**
 * The module for this assignment.   Please change the module name below to match the project name.
 * @author swong
 *
 */
module comp310_f21_hw08_comp310_f21_hw08_36 {
	requires transitive java.desktop;
	requires transitive java.rmi;
	requires java.base;
	
	exports provided.discovery;
	exports provided.rmiUtils;
	exports provided.logger;
	exports provided.datapacket;
	exports provided.pubsubsync;
	exports provided.pubsubsync.impl;
	
	exports provided.config;
	exports provided.datapacket.test;
	exports provided.discovery.impl;
	exports provided.discovery.impl.model;
	exports provided.discovery.impl.view;
	exports provided.extvisitor;
	exports provided.mixedData;
	exports provided.mixedData.test;
	exports provided.rmiUtils.classServer;
	exports provided.utils.dispatcher;
	exports provided.utils.dispatcher.impl;
	exports provided.utils.displayModel;
	exports provided.utils.file;
	exports provided.utils.file.impl;
	exports provided.utils.function;
	exports provided.utils.loader;
	exports provided.utils.loader.impl;
	exports provided.utils.logic;
	exports provided.utils.logic.impl;
	exports provided.utils.struct;
	exports provided.utils.struct.impl;
	exports provided.utils.valueGenerator;
	exports provided.utils.valueGenerator.impl;
	
	/**
	 *  Add exports for at least the following package and necessary sub-packages: 
	 *   - common
	 *   - student-defined message types and implementations
	 *   - any serialized support packages used by message implementations
	 */
	exports common.connector;
	exports common.receiver;
	exports common.connector.messages;
	exports common.receiver.messages;
	exports common.adapter;
	exports ay32_yh87.chatApp.model.message;
	exports ay32_yh87.chatRoom.miniModel.message;
	exports ay32_yh87.chatApp.model;
	
}