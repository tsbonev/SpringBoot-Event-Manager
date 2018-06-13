package com.tsbonev.Controller;

import com.tsbonev.Entity.Event;
import com.tsbonev.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Event> getAllEvents(){ return eventService.getAll();}

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Event getStudentById(@PathVariable("id") int id){
        return eventService.getById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id){
        eventService.removeById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Event event){

        eventService.update(event);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Event event){

        eventService.insert(event);
    }

}
