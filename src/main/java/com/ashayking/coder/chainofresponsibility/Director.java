package com.ashayking.coder.chainofresponsibility;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("Directors can approve");
		} else {
			succesor.handleRequest(request);
		}
	}

}
