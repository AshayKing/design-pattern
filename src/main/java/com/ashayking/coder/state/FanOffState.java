package com.ashayking.coder.state;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class FanOffState extends State {

	private Fan fan;

	public FanOffState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning Fan onto LOW");
		fan.setState(fan.getFanLowState());
	}

	@Override
	public String toString() {
		return "Fan is OFF";
	}

}
