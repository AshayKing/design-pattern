package com.ashayking.coder.command;

/**
 * Concrete command
 * 
 * @author Ashay S Patil
 *
 */
public class OnCommand implements Command {

	private Light light;

	public OnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
