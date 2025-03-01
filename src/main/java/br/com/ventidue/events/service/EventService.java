package br.com.ventidue.events.service;

import br.com.ventidue.events.model.Event;
import br.com.ventidue.events.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class EventService {

    @Autowired
    private EventRepo eventRepository;

    public Event addNewEvent( Event event) {
        event.setPrettyName(event.getTitle().toLowerCase().replaceAll(" ", "-"));
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return (List<Event>)eventRepository.findAll();
    }

    public Event getByPrettyName(String prettyName) {
        return eventRepository.findByPrettyName(prettyName);
    }


}
