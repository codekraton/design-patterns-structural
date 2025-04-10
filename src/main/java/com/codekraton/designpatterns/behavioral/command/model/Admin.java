package com.codekraton.designpatterns.behavioral.command.model;

/*
* Invoker
* */

import com.codekraton.designpatterns.behavioral.command.command.Command;

public class Admin {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        command.execute();
    }
}
