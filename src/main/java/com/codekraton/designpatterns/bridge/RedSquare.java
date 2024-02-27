package com.codekraton.designpatterns.bridge;

public class RedSquare extends Square {

	@Override
	public void applyColor() {
		System.out.println("Applying red color");
	}
}
