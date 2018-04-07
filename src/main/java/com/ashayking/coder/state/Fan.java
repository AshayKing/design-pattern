package com.ashayking.coder.state;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class Fan {

	State fanOffState;
	State fanLowState;
	State fanHighState;

	State state;

	public Fan() {
		fanOffState = new FanOffState(this);
		fanLowState = new FanLowState(this);
		fanHighState = new FanHighState(this);
		
		state = fanOffState;
	}

	public void pullChain() {
		state.handleRequest();
	}

	@Override
	public String toString() {
		return state.toString();
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getFanOffState() {
		return fanOffState;
	}

	public State getFanLowState() {
		return fanLowState;
	}

	public State getFanHighState() {
		return fanHighState;
	}

}
