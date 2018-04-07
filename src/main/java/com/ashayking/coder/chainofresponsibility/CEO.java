package com.ashayking.coder.chainofresponsibility;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class CEO extends Handler {

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEO can approave anything");
	}

}
