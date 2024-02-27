package com.codekraton.designpatterns.composite;

import java.util.Iterator;
import java.util.List;

public class Menu {
	private String name;
	private String url;

	public List<MenuItem> menuItems;

	public List<Menu> menus;

	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	public MenuItem add(MenuItem menuItem) {
		menuItems.add(menuItem);
		return menuItem;
	}

	public Menu add(Menu menu) {
		menus.add(menu);
		return menu;
	}

	public MenuItem remove(MenuItem menuItem) {
		menuItems.remove(menuItem);
		return menuItem;
	}

	public Menu remove(Menu menu) {
		menus.remove(menu);
		return menu;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(); //builder pattern
		
		builder.append(this);
		
		Iterator<MenuItem> itrMenuItems = menuItems.iterator();
		Iterator<Menu> itrMenu = menus.iterator();
		while(itrMenuItems.hasNext()) {
			MenuItem menuItem = itrMenuItems.next();
			builder.append(menuItem.toString());
		}

		while(itrMenu.hasNext()) {
			Menu menu = itrMenu.next();
			builder.append(menu.toString());
		}
		
		return builder.toString();
	}
}
