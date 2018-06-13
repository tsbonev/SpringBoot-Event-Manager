package com.tsbonev.Dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.tsbonev.Entity.Event;

import java.util.Collection;

@Repository
@Qualifier("mysqlData")
public class MysqlEventDao implements BaseDao<Event> {


    @Override
    public Collection<Event> getAll() {
        return null;
    }

    @Override
    public Event getById(int id) {
        return null;
    }

    @Override
    public void removeById(int id) {

    }

    @Override
    public void update(Event item) {

    }

    @Override
    public void insert(Event item) {

    }
}
