package com.aptech.messenger.server;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

public class ServerMainClass {

    public static final Connection SQL_CONNECTION;
    public static final Map<String, ServerClientSocket> ONLINE_USERS;

    static {
        SQL_CONNECTION = null;
        ONLINE_USERS = new HashMap<String, ServerClientSocket>();
    }

    /**
     * @param args
     */
    public void main(String[] args) {
        // TODO - implement ServerMainClass.main
        throw new UnsupportedOperationException();
    }

}