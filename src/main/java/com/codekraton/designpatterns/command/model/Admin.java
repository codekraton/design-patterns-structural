package com.codekraton.designpatterns.command.model;

/*
* Invoker
* */

import com.codekraton.designpatterns.command.command.Command;

public class Admin {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        command.execute();
    }
}
