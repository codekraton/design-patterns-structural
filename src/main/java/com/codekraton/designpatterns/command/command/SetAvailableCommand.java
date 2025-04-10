package com.codekraton.designpatterns.command.command;

import com.codekraton.designpatterns.command.model.Station;

public record SetAvailableCommand(Station station) implements Command {

    @Override
    public void execute() {
        station.setAvailable();
    }
}
