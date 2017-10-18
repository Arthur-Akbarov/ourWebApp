package com.slak.shop.dao.impl.hsqldb;

import com.slak.shop.dao.interfaces.DAOClient;
import com.slak.shop.dao.interfaces.DAOFactory;
import com.slak.shop.dao.interfaces.DAOGood;

public class HsqldbDAOFactory implements DAOFactory {

    @Override
    public DAOGood getDaoGood() {
        return new HsqldbDAOGood();
    }

    @Override
    public DAOClient getDaoClient() {
        return new HsqldbDAOClient();
    }
}
