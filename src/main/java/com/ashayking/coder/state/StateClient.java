package com.ashayking.coder.state;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class StateClient {

	public static void main(String[] args) {

		Fan fan = new Fan();

		System.out.println(fan);
		fan.pullChain();
		System.out.println(fan);
		fan.pullChain();
		System.out.println(fan);
		fan.pullChain();

	}

}
