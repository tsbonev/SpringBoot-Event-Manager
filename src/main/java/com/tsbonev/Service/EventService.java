package com.tsbonev.Service;

import com.tsbonev.Dao.BaseDao;
import com.tsbonev.Entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EventService {


    @Autowired
    @Qualifier("fakeData")
    private BaseDao<Event> eventDao;

    public Collection<Event> getAll(){
        return eventDao.getAll();
    }

    public Event getById(int id){
        return eventDao.getById(id);
    }

    public void removeById(int id) {
        this.eventDao.removeById(id);
    }

    public void update(Event event){

        eventDao.update(event);
    }

    public void insert(Event event) {
        eventDao.insert(event);
    }

}
