package com.example.speechtool.domain;

import java.util.List;

public interface EventRepository {

    Event create(Event event);

    List<Event> findAllEvents();
}
