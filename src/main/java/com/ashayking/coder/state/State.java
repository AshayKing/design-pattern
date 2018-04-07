package com.ashayking.coder.state;

/**
 * 
 * @author Ashay S Patil
 *
 */
public abstract class State {

	public void handleRequest() {
		System.out.println("Shouldn't be able to get here");
	}
}
