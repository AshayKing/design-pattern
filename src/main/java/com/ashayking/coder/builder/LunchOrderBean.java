package com.ashayking.coder.builder;

/**
 * 
 * @author Ashay S Patil
 * 
 *         In this design, we are exposing all get* & set* to client and due to
 *         which immutable property is violated.
 *
 */
public class LunchOrderBean {

	private String bread;
	private String condiments;
	private String dressings;
	private String coldDrinks;
	private String dessert;

	public LunchOrderBean() {

	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}

	public String getDressings() {
		return dressings;
	}

	public void setDressings(String dressings) {
		this.dressings = dressings;
	}

	public String getColdDrinks() {
		return coldDrinks;
	}

	public void setColdDrinks(String coldDrinks) {
		this.coldDrinks = coldDrinks;
	}

	public String getDessert() {
		return dessert;
	}

	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

}
