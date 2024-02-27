package com.codekraton.designpatterns.bridge;

public class Shape1BridgeDemo {

    public static void main(String args[]) {

		/*
			TODO: Excercise two
			Create a bridge to seperate Shape & Color, using the bridge design pattern.
		*/

        Circle circle = new BlueCircle();

        Square square = new RedSquare();

        Square greenSquare = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();
    }

}
