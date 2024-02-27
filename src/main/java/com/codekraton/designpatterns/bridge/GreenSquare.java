package com.codekraton.designpatterns.bridge;

public class GreenSquare extends Square {

	@Override
	public void applyColor() {
		System.out.println("Applying green color");
	}

}
