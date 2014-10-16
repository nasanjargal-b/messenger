package com.aptech.messenger.server;

import com.aptech.messenger.server.dao.*;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;

import com.aptech.messenger.model.*;
import com.aptech.messenger.server.exception.*;

public class ServerClientSocket implements Runnable {

    /**
	 * Online хэрэглэгчидийг уг static object-д бүртгэж хадгалах
	 * юм. хадгалахдаа username -ийг түлхүүр үг болгон тухайн
	 * хэрэглэгчийн ServerClientSocket-ийг утгах болгон map
	 * хэлбэрээр хадгалана. Ингэснээр хэрэглэгчийн мэдээллийг
	 * илүү хялбараар хайж олох юм.
	 */
	public static final java.util.Map<String, ServerClientSocket> ONLINE_USERS = new HashMap<String, ServerClientSocket>();

    UserDAO userDao;
    private Socket socket;
    protected UserService userService;
    private ObjectOutputStream oos;
	ChatService chatService;
	GroupChatService groupChatService;

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
	 * чадвал ONLINE_USERS өөрийгөө бүртгэж өгнө. Мөн өөрийн нэвтэрсэн тухайг
	 * бусад онлайн хэрэглэгчид рүү илгээнэ.
	 * @param authDetails
	 */
    private void signIn(AuthDetails authDetails) throws UserNotFoundException {
        // TODO - implement ServerClientSocket.signIn
        throw new UnsupportedOperationException();
    }

    /**
	 * Хэрэглэгч серверээс гарах үед дуудагдах method. Хэрэгэлгчийг
	 * ONLINE_USERS-ээс хасаж тухайн хэрэглэгч системээс
	 * гарсан гэсэн мэдээллийг бүх хэрэглэгчидрүү илгээнэ.
	 */
    public void signOut() {
        // TODO - implement ServerClientSocket.signOut
        throw new UnsupportedOperationException();
    }

    /**
     * @param model
     */
    public synchronized void send(Model model) {
        // TODO - implement ServerClientSocket.send
        throw new UnsupportedOperationException();
    }
}