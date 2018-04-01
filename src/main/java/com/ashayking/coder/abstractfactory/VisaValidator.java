package com.ashayking.coder.abstractfactory;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class VisaValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}

}