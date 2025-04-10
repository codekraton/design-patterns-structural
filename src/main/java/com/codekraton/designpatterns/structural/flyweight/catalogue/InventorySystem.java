package com.codekraton.designpatterns.structural.flyweight.catalogue;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
	
	private final Catalog catalog = new Catalog();
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();
	
	void takeOrder(String itemName, int orderNumber) {
		//TODO implement a way of adding an order to the order list based on an item name & order number
	}

	void process() {
		//TODO implement a way of calling processOrder on every order in the order list
	}

	String report() {
		return "\nTotal Item objects made: "
				+ catalog.totalItemsMade();
	}
}