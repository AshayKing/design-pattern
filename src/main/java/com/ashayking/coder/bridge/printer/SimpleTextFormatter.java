package com.ashayking.coder.bridge.printer;

import java.util.List;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class SimpleTextFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(header);
		stringBuilder.append("\n");

		for (Detail detail : details) {
			stringBuilder.append(detail.getLabel());
			stringBuilder.append(":");
			stringBuilder.append(detail.getValue());
			stringBuilder.append("\n");
		}

		return stringBuilder.toString();
	}

}