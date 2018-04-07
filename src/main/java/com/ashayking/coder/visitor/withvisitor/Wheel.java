package com.ashayking.coder.visitor.withvisitor;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class Wheel implements AtvPart {

	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}

}
