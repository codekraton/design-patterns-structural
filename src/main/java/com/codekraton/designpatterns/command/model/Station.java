package com.codekraton.designpatterns.command.model;

public class Station implements Device {

    @Override
    public void turnOn() {
        System.out.println("Charger is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Charger is turned off");
    }

    public void setAvailable() {
        System.out.println("Station is available");
    }
}
