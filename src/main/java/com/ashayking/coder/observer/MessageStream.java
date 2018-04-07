package com.ashayking.coder.observer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class MessageStream extends Subject {

	private Deque<String> messageHistory = new ArrayDeque<>();
	
	@Override
	void setState(String message) {
		messageHistory.addLast(message);
		this.notifyObservers();
	}

	@Override
	String getState() {
		return messageHistory.getLast();
	}

}
