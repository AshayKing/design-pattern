package com.ashayking.coder.decorator;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class DecoratorClient {

	public static void main(String[] args) {

		Sandwich sandwich = new DressingDecorator(
								new MeatDecorator(
									new SimpleSandwich()
								)
							);

		System.out.println(sandwich.make());
	}
}
