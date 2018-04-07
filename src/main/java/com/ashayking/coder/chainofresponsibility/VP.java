package com.ashayking.coder.chainofresponsibility;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class VP extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getRequestType() == RequestType.PURCHASE) {
			if (request.getAmount() < 1500) {
				System.out.println("VP can approve purchase below 1500");
			} else {
				succesor.handleRequest(request);
			}
		}
	}

}
