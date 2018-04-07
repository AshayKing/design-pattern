package com.ashayking.coder.chainofresponsibility;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class ChainOfRespClient {

	public static void main(String[] args) {
		Director director = new Director();
		VP vp = new VP();
		CEO ceo = new CEO();
		
		// Setting up chain
		director.setSuccesor(vp);
		vp.setSuccesor(ceo);
		
		Request request = new Request(RequestType.CONFERENCE, 500);
		director.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1000);
		director.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 2000);
		director.handleRequest(request);
	}
}
