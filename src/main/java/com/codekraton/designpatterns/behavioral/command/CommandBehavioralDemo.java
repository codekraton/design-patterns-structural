package com.codekraton.designpatterns.behavioral.command;

import com.codekraton.designpatterns.behavioral.command.command.*;
import com.codekraton.designpatterns.behavioral.command.model.Admin;
import com.codekraton.designpatterns.behavioral.command.model.Charger;
import com.codekraton.designpatterns.behavioral.command.model.Station;

public class CommandBehavioralDemo {
    public static void main(String[] args) {
        Station station = new Station();
        Charger charger = new Charger();
        Admin admin = new Admin();

        var startChargingCommand = new StartChargingCommand(charger);
        var setAvailableCommand = new SetAvailableCommand(station);
        var turnOnStationCommand = new TurnOnSystemCommand(station);
        var turnOnChargerCommand = new TurnOnSystemCommand(charger);
        var turnOffCommand = new TurnOffSystemCommand(station);

        setAndExecute(admin, setAvailableCommand);
        setAndExecute(admin, turnOnStationCommand);
        setAndExecute(admin, turnOnChargerCommand);
        setAndExecute(admin, startChargingCommand);
        setAndExecute(admin, turnOffCommand);
    }

    private static void setAndExecute(Admin admin, Command command) {
        admin.setCommand(command);
        admin.executeCommand();
    }
}
