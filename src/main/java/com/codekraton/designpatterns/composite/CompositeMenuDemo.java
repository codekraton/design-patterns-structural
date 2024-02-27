package com.codekraton.designpatterns.composite;


public class CompositeMenuDemo {

	public static void main(String[] args) {

		/*
			TODO: Excercise 3
			Create a common interface between Menu & MenuItem which declares a way to
			print the entire menu-tree
		 */

		Menu mainMenu = new Menu("Main", "/main");
		
		MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
		
		mainMenu.add(safetyMenuItem);
		
		Menu claimsSubMenu = new Menu("Claims", "/claims");
		
		mainMenu.add(claimsSubMenu);
		
		MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
		
		claimsSubMenu.add(personalClaimsMenu);
		
		System.out.println(mainMenu.toString());
	}
}
