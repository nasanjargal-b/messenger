package com.aptech.messenger.server;

import com.aptech.messenger.server.dao.*;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import com.aptech.messenger.model.*;

public class ServerClientSocket implements Runnable {

    UserDAO userDao;
    private Socket socket;
    protected UserService userService;
	private ObjectOutputStream oos;

    /**
     * @param socket
     */
    public ServerClientSocket(Socket socket) throws IOException {
        this.socket = socket;
        this.userDao = new UserDAO();
        this.userService = new UserService(userDao, this);
        oos = new ObjectOutputStream(this.socket.getOutputStream());
    }

    /**
     * Уг method нь хэрэглэгчээс ирсэн бүх моделийг хүлээн авч ангилан
     * зориулалтын методыг дуудана.
     */
    @Override
    public void run() {
        throw new UnsupportedOperationException();
    }

    /**
     * Хэрэглэгч системд нэвтрэх эсэхийг зохиуцуулах бөгөөд хэрэв нэвтэрч
     * чадвал ServerMainClass.ONLINE_USERS өөрийгөө бүртгэж өгнө.
     *
     * @param authDetails
     */
    private void signIn(AuthDetails authDetails) {
        // TODO - implement ServerClientSocket.signIn
        throw new UnsupportedOperationException();
    }

    /**
     * @param model
     */
    public void send(Model model) {
        // TODO - implement ServerClientSocket.send
        throw new UnsupportedOperationException();
    }

	/**
	 * Хэрэглэгч серверээс гарах үед дуудагдах method. Хэрэгэлгчийг
	 * ServerMainClass.ONLINE_USERS-ээс хасаж тухайн хэрэглэгч системээс
	 * гарсан гэсэн мэдээллийг бүх хэрэглэгчидрүү илгээнэ.
	 */
	public void signOut() {
		// TODO - implement ServerClientSocket.signOut
		throw new UnsupportedOperationException();
	}
}