package com.example.speechtool.adapter.in;

import com.example.speechtool.application.EventApplicationService;
import com.example.speechtool.domain.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    private final EventApplicationService eventApplicationService;

    public EventController(EventApplicationService eventApplicationService) {
        this.eventApplicationService = eventApplicationService;
    }

    @PostMapping("/event")
    public Event createEvent(@RequestBody EventRequest request) {
        return eventApplicationService.create(request.toCreateEventCommand());
    }

    @GetMapping("/event")
    public List<Event> findAllEvents() {
        return eventApplicationService.findAllEvents();
    }


}
