package com.ashayking.coder.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ashay S Patil
 *
 */
public abstract class Subject {

	private List<Observer> observers = new ArrayList<>();

	abstract void setState(String state);

	abstract String getState();

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		observers.stream().forEach(Observer::update);
	}
}
