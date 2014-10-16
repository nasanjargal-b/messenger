package com.aptech.messenger.server.dao;

import java.sql.Connection;

/**
 * Уг класс нь Өгөгдлийн баазтай холбогдоход хэрэглэгдэх dao
 * class үүсгэхэд хэрэгцээтэй мэдээллээр хангах юм.
 */
public class DaoSupport {

    private static Connection SQL_CONNECTION;

    /**
     * Sql Connection үүсгэх зорилготой
     */
    public DaoSupport() {
        // TODO - implement DaoSupport.DaoSupport
        throw new UnsupportedOperationException();
    }

    protected Connection getConnection() {
        return SQL_CONNECTION;
    }

}