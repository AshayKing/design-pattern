package com.ashayking.coder.command;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class CommandClient {

	public static void main(String[] args) {
		Light light = new Light();
		Switch lightSwitch = new Switch();

		Command commandOn = new OnCommand(light);
		lightSwitch.storeAndExecute(commandOn);
		
		Command commandOff = new OffCommand(light);
		lightSwitch.storeAndExecute(commandOff);
	}
}
