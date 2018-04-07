package com.ashayking.coder.command;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class ToggleCommand implements Command {
	
	private Light light;

	public ToggleCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.toggle();
	}

}
