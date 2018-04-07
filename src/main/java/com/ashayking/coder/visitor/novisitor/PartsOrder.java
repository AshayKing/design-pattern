package com.ashayking.coder.visitor.novisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class PartsOrder {

	private List<AtvPart> parts = new ArrayList<>();

	public PartsOrder() {

	}

	public void addParts(AtvPart atvPart) {
		parts.add(atvPart);
	}

	public List<AtvPart> getParts() {
		return Collections.unmodifiableList(parts);
	}

	public double calculateShipping() {
		return parts.stream().mapToDouble(AtvPart::calculateShipping).sum();
	}
}
