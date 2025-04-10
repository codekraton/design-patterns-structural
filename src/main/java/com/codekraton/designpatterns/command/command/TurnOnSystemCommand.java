package com.codekraton.designpatterns.command.command;

import com.codekraton.designpatterns.command.model.Device;

public record TurnOnSystemCommand(Device device) implements Command {

    @Override
    public void execute() {
        device.turnOn();
    }
}
