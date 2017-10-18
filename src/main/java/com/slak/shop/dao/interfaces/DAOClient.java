package com.slak.shop.dao.interfaces;

import com.slak.shop.model.Client;

public interface DAOClient extends DAO<Client> {

    Client getById(int id);
}
