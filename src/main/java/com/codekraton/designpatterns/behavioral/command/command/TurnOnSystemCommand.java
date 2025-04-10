package com.codekraton.designpatterns.behavioral.command.command;

import com.codekraton.designpatterns.behavioral.command.model.Device;

public record TurnOnSystemCommand(Device device) implements Command {

    @Override
    public void execute() {
        device.turnOn();
    }
}
