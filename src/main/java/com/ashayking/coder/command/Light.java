package com.ashayking.coder.command;

/**
 * Reciever
 * 
 * @author Ashay S Patil
 *
 */
public class Light {
	
	private boolean isOn = false;
	
	public boolean isOn() {
		return isOn;
	}
	
	public void toggle() {
		if(isOn) {
			off();
			isOn = false;
		}else {
			on();
			isOn = true;
		}
		
	}

	public void on() {
		System.out.println("Light On");
	}

	public void off() {
		System.out.println("Light Off");
	}
}
