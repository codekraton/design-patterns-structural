package com.codekraton.designpatterns.composite;


public class MenuItem {

	private String name;
	private String url;

	public MenuItem(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(name);
		builder.append(": ");
		builder.append(url);
		builder.append("\n");
		return builder.toString();
	}
}
