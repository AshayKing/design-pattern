package com.ashayking.coder.interpreter;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class InterpreterClient {

	static Expression buildInterpreterTree() {
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		Expression terminal3 = new TerminalExpression("Bears");

		// Tigers And Bears
		Expression alternation1 = new AndExpression(terminal2, terminal3);

		// Lions or (Tiger and Bears)
		Expression alternation2 = new OrExpression(terminal1, alternation1);

		return new AndExpression(terminal3, alternation2);
	}

	public static void main(String[] args) {

		// String context = "Lions";
		// String context = "Tigers";
		// String context = "Lions Bears";
		String context = "Tigers Bears";

		Expression expression = buildInterpreterTree();

		System.out.println(context + " is " + expression.interpret(context));

	}
}
