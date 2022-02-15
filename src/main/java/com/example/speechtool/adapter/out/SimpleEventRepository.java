package com.example.speechtool.adapter.out;

import com.example.speechtool.domain.Event;
import com.example.speechtool.domain.EventRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SimpleEventRepository implements EventRepository {

    private final Map<Integer, Event> repository = new HashMap<>();

    @Override
    public Event create(Event event) {
        // the DB has to give us a valid id, because we decided that it is its job
        Event letsAssumeTheDbDidThis = new Event(repository.size(),
                                 event.name());

        repository.put(letsAssumeTheDbDidThis.id(),
                       letsAssumeTheDbDidThis);

        return letsAssumeTheDbDidThis;
    }

    @Override
    public List<Event> findAllEvents() {
        return repository.values()
                         .stream()
                         .toList();
    }
}
