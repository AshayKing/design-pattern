package com.ashayking.coder.command;

/**
 * Concrete command
 * 
 * @author Ashay S Patil
 *
 */
public class OffCommand implements Command {

	private Light light;

	public OffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}
