package com.codekraton.designpatterns.command.model;

public class Charger implements Device {
    @Override
    public void turnOn() {
        System.out.println("Charger is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Charger is turned off");
    }

    public void startCharging() {
        System.out.println("Charging...");
    }
}
