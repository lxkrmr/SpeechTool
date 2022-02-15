package com.example.speechtool.adapter.in;

import com.example.speechtool.domain.CreateEventCommand;

import java.util.UUID;

public record EventRequest(String name) {

    public CreateEventCommand toCreateEventCommand() {
        return new CreateEventCommand(name);
    }
}
