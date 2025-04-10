package com.codekraton.designpatterns.structural.decorator;

public class DecoratorSandwichDemo {

	public static void main(String args[]) {
		Sandwich sandwich = new SimpleSandwich();
		/*
			TODO: Excercise four
			Create decorators for a sandwich so that we're able to create a sandwich with Meat or with Dressing, or both
		*/

		System.out.println(sandwich.make());
	}
}
