package com.ashayking.coder.composite;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class CompositeClient {

	public static void main(String[] args) {
		Menu mainMenu = new Menu("Main", "/main");

		MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
		mainMenu.add(safetyMenuItem);

		Menu claimsSubMenu = new Menu("Claims", "/claims");
		mainMenu.add(claimsSubMenu);

		MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaim");
		claimsSubMenu.add(personalClaimsMenu);

		System.out.println(mainMenu.toString());
	}
}