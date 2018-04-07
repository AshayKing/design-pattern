package com.ashayking.coder.strategy;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class StrategyClient {

	public static void main(String[] args) {
		CreditCard amexCard = new CreditCard(new AmexStrategy());

		amexCard.setNumber("379185883464283");
		amexCard.setDate("04/2029");
		amexCard.setCvv("123");

		System.out.println("Is Amex Valid : " + amexCard.isValid());
		
		CreditCard visaCard = new CreditCard(new VisaStrategy());

		visaCard.setNumber("4539589763663402");
		visaCard.setDate("05/2018");
		visaCard.setCvv("234");

		System.out.println("Is Visa Valid : " + visaCard.isValid());
	}
}
