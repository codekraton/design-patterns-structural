package com.codekraton.designpatterns.behavioral.command.command;

import com.codekraton.designpatterns.behavioral.command.model.Charger;

public record StartChargingCommand(Charger charger) implements Command {
    @Override
    public void execute() {
        charger.startCharging();
    }
}
