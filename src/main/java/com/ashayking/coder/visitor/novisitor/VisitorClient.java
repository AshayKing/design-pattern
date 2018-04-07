package com.ashayking.coder.visitor.novisitor;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class VisitorClient {

	public static void main(String[] args) {
		PartsOrder order = new PartsOrder();
		order.addParts(new Wheel());
		order.addParts(new Oil());
		order.addParts(new Fender());

		double shippingCost = order.calculateShipping();
		System.out.println(shippingCost);
	}
}
