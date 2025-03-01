package br.com.ventidue.events.controller;

import br.com.ventidue.events.model.Event;
import br.com.ventidue.events.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/events")
    public Event addNewEvent(@RequestBody Event newEvent ) {
        return  eventService.addNewEvent(newEvent);
    }

    @GetMapping("/events")
    public List<Event> getAllEvents() {
        return  eventService.getAllEvents();
    }
    @GetMapping("/events/{prettyName}")
    public Event getEventByPrettyName(@PathVariable String prettyName) {
        return  eventService.getByPrettyName(prettyName);
    }

}
