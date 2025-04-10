package com.codekraton.designpatterns.command.command;

import com.codekraton.designpatterns.command.model.Charger;

public class CommandHandler {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
