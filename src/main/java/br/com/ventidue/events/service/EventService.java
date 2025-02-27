package br.com.ventidue.events.service;

import br.com.ventidue.events.model.Event;
import br.com.ventidue.events.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepo eventRepository;


}
