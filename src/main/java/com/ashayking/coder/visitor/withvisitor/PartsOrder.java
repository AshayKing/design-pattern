package com.ashayking.coder.visitor.withvisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class PartsOrder implements AtvPart {

	private List<AtvPart> parts = new ArrayList<>();

	public PartsOrder() {

	}

	public void addParts(AtvPart atvPart) {
		parts.add(atvPart);
	}

	public List<AtvPart> getParts() {
		return Collections.unmodifiableList(parts);
	}

	@Override
	public void accept(AtvPartVisitor visitor) {
		for(AtvPart part : parts) {
			part.accept(visitor);
		}
		visitor.visit(this);
	}
}
