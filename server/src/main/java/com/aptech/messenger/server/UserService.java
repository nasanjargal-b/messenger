package com.aptech.messenger.server;

import com.aptech.messenger.server.dao.*;
import com.aptech.messenger.model.*;

/**
 * Тухайн хэрэглэгчтэй харьцах асуудлыг зохицуулах service класс
 */
public class UserService {

    UserDAO userDao;
    ServerClientSocket serverClientSocket;
	ImageService imageService;

    public UserService(UserDAO userDao, ServerClientSocket serverClientSocket) {
        this.userDao = userDao;
        this.serverClientSocket = serverClientSocket;
        this.serverClientSocket.userService = this;
    }

    /**
	 * Хэрэглэгчийн нууү үгийг солино.
	 * @param changePasswordInfo
	 */
    public void changePassword(ChangePasswordInfo changePasswordInfo) {
        // TODO - implement UserService.changePassword
        throw new UnsupportedOperationException();
    }

    /**
	 * Хэрэглэгчийн бүртгэлийн мэдээллийг авч username-ийн дагуу шалгаад
	 * хэрэв тухайн хэрэглэгч өмнө нь бүртгэгдээгүй бол шинээр бүртгэх биш
	 * бол хуучин бүртгэлийг шинэчлэх үйлдлийг хийнэ.
	 * @param registerInfo
	 */
    public void registerUser(RegisterInfo registerInfo) {
        // TODO - implement UserService.registerUser
        throw new UnsupportedOperationException();
    }

}