package com.codekraton.designpatterns.decorator;

public class SimpleSandwich implements Sandwich {

	@Override
	public String make() {
		return "Bread";
	}
}
