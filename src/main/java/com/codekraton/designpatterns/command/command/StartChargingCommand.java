package com.codekraton.designpatterns.command.command;

import com.codekraton.designpatterns.command.model.Charger;

public record StartChargingCommand(Charger charger) implements Command {
    @Override
    public void execute() {
        charger.startCharging();
    }
}
