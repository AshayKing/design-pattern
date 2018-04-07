package com.ashayking.coder.interpreter;

import java.util.StringTokenizer;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class TerminalExpression implements Expression {

	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (token.equals(data)) {
				return true;
			}
		}
		return false;
	}

}
