package com.ashayking.coder.builder;

import com.ashayking.coder.builder.LunchOrder.Builder;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class BuilderClient {

	public static void main(String[] args) {
		Builder builder = new Builder();
		
		LunchOrder lunchOrder = builder.bread("Wheat")
									   .dessert("ice-cream")
									   .coldDrinks("soda")
									   .build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getDessert());
		System.out.println(lunchOrder.getColdDrinks());
	}
}
