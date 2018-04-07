package com.ashayking.coder.mediator;

/**
 * Reciever
 * 
 * @author Ashay S Patil
 *
 */
public class Light {

	private boolean isOn = false;
	private String location = "";

	public Light() {

	}

	public Light(String location) {
		this.location = location;
	}

	public boolean isOn() {
		return isOn;
	}

	public void toggle() {
		if (isOn) {
			off();
			isOn = false;
		} else {
			on();
			isOn = true;
		}

	}

	public void on() {
		System.out.println("Light On : " + getLocation());
	}

	public void off() {
		System.out.println("Light Off : " + getLocation());
	}

	public String getLocation() {
		return location;
	}

}
