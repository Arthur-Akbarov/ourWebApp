package com.slak.shop.dao.impl.hsqldb;

import java.util.Collection;
import com.slak.shop.dao.interfaces.DAOGood;
import com.slak.shop.model.Good;

public class HsqldbDAOGood implements DAOGood {

    @Override
    public void add(Good value) {
    }

    @Override
    public Collection<Good> getAll() {
        return null;
    }

    @Override
    public void update(Good value) {
    }

    @Override
    public boolean remove(Good value) {
        return false;
    }

    @Override
    public Good getById(int id) {
        // здесь должен быть код, берущий connect из connection pool
        // и делающий select запрос к таблице товаров по id
        return new Good(id, "film Terminator", 34);
    }
}
