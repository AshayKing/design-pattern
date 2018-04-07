package com.ashayking.coder.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class Mediator {

	List<Light> lights = new ArrayList<>();

	public void registerLight(Light light) {
		lights.add(light);
	}

	public void turnOnAllLights() {
		lights.stream().forEach(light -> {
			if (!light.isOn())
				light.toggle();
		});
	}

	public void turnOffAllLights() {
		lights.stream().forEach(light -> {
			if (light.isOn())
				light.toggle();
		});
	}
}
