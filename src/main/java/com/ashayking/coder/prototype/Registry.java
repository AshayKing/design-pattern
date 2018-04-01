package com.ashayking.coder.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * This is registry class which holds information all object which are eligigle
 * for cloning
 * 
 * @author Ashay S Patil
 *
 */
public class Registry {

	private Map<String, Item> items = new HashMap<>();

	public Registry() {
		loadItems();
	}

	public Item createProtoType(String type) {
		Item item = null;
		try {
			// Creating ProtoType
			item = (Item) items.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}

	private void loadItems() {
		// Add a movie
		Movie movie = new Movie();
		movie.setTitle("Don");
		movie.setUrl("http://don.com");
		movie.setPrice(100);
		movie.setRunTime("2:30 Hrs");
		items.put("MOVIE", movie);

		// Add a Book
		Book book = new Book();
		book.setTitle("Walk to Remember");
		book.setUrl("http://walktoremember.com");
		book.setPrice(80);
		book.setNumberOfPages(100);
		items.put("BOOK", book);
	}
}
