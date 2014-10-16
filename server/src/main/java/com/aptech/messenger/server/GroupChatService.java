package com.aptech.messenger.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.aptech.messenger.model.*;
import com.aptech.messenger.server.exception.*;

/**
 * Груп чатыг удирдах зориулалт бүхий service class
 */
public class GroupChatService {

    /**
	 * Групын мэдээлийг хадгалах зориулалт бүхий object юм.
	 * Групын мэдээлийг хадгалахдаа тухайн групын groupId-г түлхүүр болгон харгалзах хэрэглэгчидийн ServerClientSocket-уудыг жагсаалт маягаар хадгана.
	 */
	private static final Map<String, List<ServerClientSocket>> GROUPS = new HashMap<String, List<ServerClientSocket>>();

	/**
	 * Групын мэдээллийг шинэчлэх хэрэв тухайн груп байхгүй бол шинээр
	 * үүсгэх үйлдлүүдийг хийх бөгөөд тухайн өөрчлөлт орсон групын
	 * хэрэглэгчидрүү өөрчлөлт орсон тухай мэдээллийг илгээнэ.
	 * @param groupInfo
	 */
	public void mergeGroup(GroupInfo groupInfo) {
		// TODO - implement GroupChatService.mergeGroup
		throw new UnsupportedOperationException();
	}

	/**
	 * Групын хэрэглэгчийн илгээсэн чатын мэдээллийг хүлээн авч илгээсэн
	 * хэрэглэгчээс бусад хэрэглэгчидрүү чатын мэдээллийг илгээх үйлдлийг
	 * хийнэ.
	 * @param groupChat
	 */
	public void receive(GroupChat groupChat) {
		// TODO - implement GroupChatService.receive
		throw new UnsupportedOperationException();
	}

	/**
	 * Групын groupId гаар GroupChatService.GROUPS-ээс тухайн групыг хайж
	 * олно. Хэрэв груп олдоогүй бол GroupNotFoundException үүсгэнэ.
	 * @param groupId
	 */
	public List<ServerClientSocket> findGroupUsers(String groupId) throws GroupNotFoundException {
		// TODO - implement GroupChatService.findGroupUsers
		throw new UnsupportedOperationException();
	}

}