package com.ashayking.coder.bridge.nobridge;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class NoBridgeClient {

	public static void main(String[] args) {
		Circle circle = new BlueCircle();

		Square square = new RedSquare();

		Square greenSquare = new GreenSquare();

		circle.applyColor();
		square.applyColor();
		greenSquare.applyColor();
	}

}