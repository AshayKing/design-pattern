package com.ashayking.coder.bridge.withbridge;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class BridgeClient {

	public static void main(String[] args) {

		Color blue = new Blue();
		Shape square = new Square(blue);

		Color red = new Red();
		Shape circle = new Circle(red);

		Color green = new Green();
		Square squareGreen = new Square(green);

		square.applyColor();
		circle.applyColor();
		squareGreen.applyColor();
	}

}
