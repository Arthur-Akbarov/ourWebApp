package com.slak.shop.dao.interfaces;

import com.slak.shop.model.Good;

public interface DAOGood extends DAO<Good> {
    Good getById(int id);
}
