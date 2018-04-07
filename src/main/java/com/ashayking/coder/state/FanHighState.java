package com.ashayking.coder.state;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class FanHighState extends State {

	private Fan fan;

	public FanHighState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning Fan OFF");
		fan.setState(fan.getFanOffState());
	}

	@Override
	public String toString() {
		return "Fan is HIGH";
	}

}
