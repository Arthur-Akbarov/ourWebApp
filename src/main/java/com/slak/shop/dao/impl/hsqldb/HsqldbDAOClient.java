package com.slak.shop.dao.impl.hsqldb;

import com.slak.shop.dao.interfaces.DAOClient;
import com.slak.shop.model.Client;

import java.util.Collection;

public class HsqldbDAOClient implements DAOClient {

    @Override
    public void add(Client value) {
    }

    @Override
    public Collection<Client> getAll() {
        return null;
    }

    @Override
    public void update(Client value) {

    }

    @Override
    public boolean remove(Client value) {
        return false;
    }

    @Override
    public Client getById(int id) {
        return null;
    }
}
