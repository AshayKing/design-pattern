package com.ashayking.coder.command;

/**
 * Invoker
 * 
 * @author Ashay S Patil
 *
 */
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
