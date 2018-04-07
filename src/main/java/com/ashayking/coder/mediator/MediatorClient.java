package com.ashayking.coder.mediator;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class MediatorClient {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();

		Light bedLight = new Light("BED");
		Light kitchenLight = new Light("KITCHEN");

		mediator.registerLight(bedLight);
		mediator.registerLight(kitchenLight);
		
		Command commandOn = new TurnOnAllLightCommand(mediator);
		commandOn.execute();
		
		Command commandOff = new TurnOffAllLightCommand(mediator);
		commandOff.execute();
		
	}
}
