package com.example.speechtool.application;

import com.example.speechtool.domain.CreateEventCommand;
import com.example.speechtool.domain.Event;
import com.example.speechtool.domain.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventApplicationService {

    private final EventRepository eventRepository;

    public EventApplicationService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event create(CreateEventCommand command) {
        // create the domain object
        var event = new Event(null, command.name());

        // persist the changes
        return eventRepository.create(event);
    }

    public List<Event> findAllEvents() {
        return eventRepository.findAllEvents();
    }
}
