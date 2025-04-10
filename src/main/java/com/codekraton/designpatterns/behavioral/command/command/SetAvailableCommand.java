package com.codekraton.designpatterns.behavioral.command.command;

import com.codekraton.designpatterns.behavioral.command.model.Station;

public record SetAvailableCommand(Station station) implements Command {

    @Override
    public void execute() {
        station.setAvailable();
    }
}
