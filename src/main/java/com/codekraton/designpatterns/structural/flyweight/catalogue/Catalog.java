package com.codekraton.designpatterns.structural.flyweight.catalogue;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
	private Map<String, Item> items = new HashMap<String, Item>();

	public Item lookup(String itemName) {
		//implement a lookup
		throw new UnsupportedOperationException();
	}

	public int totalItemsMade() {
		//implement
		throw new UnsupportedOperationException();
	}
}