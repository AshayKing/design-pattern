package com.ashayking.coder.prototype;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class ProtoTypeClient {

	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createProtoType("MOVIE");
		movie.setTitle("SPIDERMAN");
		System.out.println(movie);
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		System.out.println(movie.getPrice());
		
		Movie movie2 = (Movie) registry.createProtoType("MOVIE");
		movie2.setTitle("BATMAN");
		movie2.setPrice(200);
		System.out.println(movie2);
		System.out.println(movie2.getTitle());
		System.out.println(movie2.getUrl());
		System.out.println(movie2.getPrice());
	}
}
