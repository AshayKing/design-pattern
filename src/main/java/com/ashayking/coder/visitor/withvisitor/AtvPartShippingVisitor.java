package com.ashayking.coder.visitor.withvisitor;

import java.util.List;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class AtvPartShippingVisitor implements AtvPartVisitor {

	double shippingAmount = 0d;

	@Override
	public void visit(Wheel wheel) {
		shippingAmount += 15;
		System.out.println("Wheel are bulky and expensive to ship");
	}

	@Override
	public void visit(Oil wheel) {
		shippingAmount += 9;
		System.out.println("Oil is bit expensive to ship");
	}

	@Override
	public void visit(Fender wheel) {
		shippingAmount += 3;
		System.out.println("Fender are light and cheap to ship");
	}

	@Override
	public void visit(PartsOrder partsOrder) {
		System.out.println("If you bought more than 3 things we will give you discount of 5$ on shipping");
		List<AtvPart> parts = partsOrder.getParts();
		if (parts.size() > 3) {
			shippingAmount -= 5;
		}
		System.out.println("You shipping amount is : " + shippingAmount);
	}

}
