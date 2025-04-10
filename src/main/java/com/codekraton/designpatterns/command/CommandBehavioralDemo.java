package com.codekraton.designpatterns.command;

import com.codekraton.designpatterns.command.command.*;
import com.codekraton.designpatterns.command.model.Admin;
import com.codekraton.designpatterns.command.model.Charger;
import com.codekraton.designpatterns.command.model.Station;

public class CommandBehavioralDemo {
    public static void main(String[] args) {
        Station station = new Station();
        Charger charger = new Charger();
        Admin admin = new Admin();

        var startChargingCommand = new StartChargingCommand(charger);
        var setAvailableCommand = new SetAvailableCommand(station);
        var turnOnCommand = new TurnOnSystemCommand(station);
        var turnOffCommand = new TurnOffSystemCommand(station);

        setAndExecute(admin, setAvailableCommand);
        setAndExecute(admin, turnOnCommand);
        setAndExecute(admin, startChargingCommand);
        setAndExecute(admin, turnOffCommand);
    }

    private static void setAndExecute(Admin admin, Command command) {
        admin.setCommand(command);
        admin.executeCommand();
    }
}
