package com.ashayking.coder.command;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class CommandClient {

	public static void main(String[] args) {
		Light bedLight = new Light();
		Light kitchenLight = new Light();
		
		
		Switch lightSwitch = new Switch();

		//Command commandOn = new OnCommand(bedLight);
		//lightSwitch.storeAndExecute(commandOn);
		
		//Command commandOff = new OffCommand(light);
		//lightSwitch.storeAndExecute(commandOff);
		
		Command toggle = new ToggleCommand(bedLight);
		lightSwitch.storeAndExecute(toggle);
		lightSwitch.storeAndExecute(toggle);
		lightSwitch.storeAndExecute(toggle);
		
		System.out.println("---------");
		List<Light> lights = Arrays.asList(bedLight,kitchenLight);
		Command allLightsCmd = new AllLightCommand(lights);
		lightSwitch.storeAndExecute(allLightsCmd);
	}
}
