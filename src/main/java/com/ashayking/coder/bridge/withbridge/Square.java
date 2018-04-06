package com.ashayking.coder.bridge.withbridge;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		color.applyColor();
	}

}