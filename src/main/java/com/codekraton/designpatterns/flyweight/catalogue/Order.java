package com.codekraton.designpatterns.flyweight.catalogue;

public class Order {
	public int orderNumber;
	public Item item;

	void processOrder() {
		System.out.println("Ordering " + item + " for order number " + orderNumber);
	}
}