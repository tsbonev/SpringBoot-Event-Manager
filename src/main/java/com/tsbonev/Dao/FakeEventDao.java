package com.tsbonev.Dao;

import com.tsbonev.Entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class FakeEventDao implements BaseDao<Event> {

    @Autowired
    private static Map<Long, Event> events;

    /*

    static {
        events = new HashMap<Integer, Event>(){
            {
                put(1, new Event(1, "Tarnovoconf", "Tarnovo",
                        LocalDateTime.from(LocalDateTime.now()),
                        LocalDateTime.from(LocalDateTime.now()).plusDays(6).plusHours(8)));
                put(2, new Event(2, "Burgasoconf", "Burgas",
                        LocalDateTime.from(LocalDateTime.now()).plusDays(6),
                        LocalDateTime.from(LocalDateTime.now()).plusDays(16).plusHours(3)));
                put(3, new Event(3, "Vratsaconf", "Vratsa",
                        LocalDateTime.from(LocalDateTime.now()).plusDays(16),
                        LocalDateTime.from(LocalDateTime.now()).plusDays(32).plusHours(11)));
            }
        };
    }

    */

    @Override
    public Collection<Event> getAll() {
        return events.values();
    }

    @Override
    public Event getById(int id) {
        return events.get(id);
    }

    @Override
    public void removeById(int id) {
        events.remove(id);
    }

    @Override
    public void update(Event event) {
        Event e = events.get(event.getId());
        e.setStartDate(event.getStartDate());
        e.setEndDate(event.getEndDate());
        e.setName(event.getName());
        e.setLocation(event.getLocation());
    }

    @Override
    public void insert(Event event) {
        events.put(event.getId(), event);
    }
}
