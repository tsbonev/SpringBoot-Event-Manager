package com.tsbonev.Controller;

import com.tsbonev.Dao.EventRepository;
import com.tsbonev.Entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "/event")
public class MainController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping(path = "/add")
    public String addNewEvent (@RequestParam String name,
                                             @RequestParam String location){
        Event e = new Event();
        e.setName(name);
        e.setLocation(location);
        e.setStartDate(LocalDateTime.from(LocalDateTime.now()));
        e.setEndDate(LocalDateTime.from(LocalDateTime.now()).plusDays(6).plusHours(8));
        eventRepository.save(e);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public Iterable<Event> getAllEvents(){
        return eventRepository.findAll();
    }

}
