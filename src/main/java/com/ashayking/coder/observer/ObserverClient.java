package com.ashayking.coder.observer;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class ObserverClient {

	public static void main(String[] args) {

		Subject subject =new MessageStream();
		
		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);
		
		phoneClient.addMessage("Hi There :)");
		tabletClient.addMessage("Hi There");
	}
}
