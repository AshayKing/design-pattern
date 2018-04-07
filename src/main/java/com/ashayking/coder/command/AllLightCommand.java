package com.ashayking.coder.command;

import java.util.List;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class AllLightCommand implements Command {

	private List<Light> lights;

	public AllLightCommand(List<Light> lights) {
		this.lights = lights;
	}

	@Override
	public void execute() {
		lights.stream().forEach(light -> {
			if(light.isOn()){
				light.toggle();
			}
		});
	}

}
