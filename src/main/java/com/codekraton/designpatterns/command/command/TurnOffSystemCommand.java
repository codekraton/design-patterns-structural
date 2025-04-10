package com.codekraton.designpatterns.command.command;

import com.codekraton.designpatterns.command.model.Device;

public record TurnOffSystemCommand(Device device) implements Command {
    @Override
    public void execute() {
        device.turnOff();
    }
}
