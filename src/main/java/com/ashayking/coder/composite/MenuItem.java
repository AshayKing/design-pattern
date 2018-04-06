package com.ashayking.coder.composite;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class MenuItem extends MenuComponent {

	public MenuItem(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public String toString() {
		return print();
	}
}