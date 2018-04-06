package com.ashayking.coder.bridge.withbridge;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class Circle extends Shape {

	public Circle(Color red) {
		super(red);
	}

	@Override
	public void applyColor() {
		color.applyColor();
	}

}