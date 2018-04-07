package com.ashayking.coder.visitor.withvisitor;

/**
 * 
 * @author Ashay S Patil
 *
 */
public interface AtvPartVisitor {

	void visit(Wheel wheel);

	void visit(Oil wheel);

	void visit(Fender wheel);

	void visit(PartsOrder partsOrder);

}
