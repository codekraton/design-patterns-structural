package com.codekraton.designpatterns.behavioral.command.command;

public class CommandHandler {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
