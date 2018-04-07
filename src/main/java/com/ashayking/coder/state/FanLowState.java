package com.ashayking.coder.state;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class FanLowState extends State {

	private Fan fan;

	public FanLowState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning Fan onto HIGH");
		fan.setState(fan.getFanHighState());
	}

	@Override
	public String toString() {
		return "Fan is LOW";
	}

}
