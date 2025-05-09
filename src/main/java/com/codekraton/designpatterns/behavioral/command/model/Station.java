package com.codekraton.designpatterns.behavioral.command.model;

public class Station implements Device {

    @Override
    public void turnOn() {
        System.out.println("Station is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Charger is turned off");
    }

    public void setAvailable() {
        System.out.println("Station is available");
    }
}
