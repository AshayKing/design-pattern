package com.ashayking.coder.bridge.withbridge;

/**
 * 
 * @author Ashay S Patil
 *
 */
public abstract class Shape {

	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}

	abstract public void applyColor();
}
