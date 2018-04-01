package com.ashayking.coder.abstractfactory;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}

}