package com.ashayking.coder.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ashay S Patil
 *
 */
public abstract class MenuComponent {

	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<>();

	public MenuComponent add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature not available at this level");
	}

	public MenuComponent remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature not available at this level");
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public abstract String toString();

	String print() {
		StringBuilder stringBuilder = new StringBuilder(name);
		stringBuilder.append(": ");
		stringBuilder.append(url);
		stringBuilder.append("\n");

		return stringBuilder.toString();
	}
}