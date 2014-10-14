package com.aptech.messenger.server;

import com.aptech.messenger.server.dao.*;
import com.aptech.messenger.model.*;

public class UserService {

    UserDAO userDao;
    ServerClientSocket serverClientSocket;

    public UserService(UserDAO userDao, ServerClientSocket serverClientSocket) {
        this.userDao = userDao;
        this.serverClientSocket = serverClientSocket;
        this.serverClientSocket.userService = this;
    }

    /**
     * @param changePasswordInfo
     */
    public void changePassword(ChangePasswordInfo changePasswordInfo) {
        // TODO - implement UserService.changePassword
        throw new UnsupportedOperationException();
    }

    /**
     * @param registerInfo
     */
    public void registerUser(RegisterInfo registerInfo) {
        // TODO - implement UserService.registerUser
        throw new UnsupportedOperationException();
    }

}