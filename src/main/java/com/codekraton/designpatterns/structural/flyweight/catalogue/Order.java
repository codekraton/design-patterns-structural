package com.codekraton.designpatterns.structural.flyweight.catalogue;

public class Order {
	public int orderNumber;
	public Item item;

	void processOrder() {
		System.out.println("Ordering " + item + " for order number " + orderNumber);
	}
}