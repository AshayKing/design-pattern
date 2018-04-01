package com.ashayking.coder.builder;

/**
 * 
 * @author Ashay S Patil
 * 
 *         In this design, we are creating too many ctor + we are also lacking
 *         for creating LunchOrder with different order.
 *         
 *         For every different order we will have to add Ctor
 * 
 */
public class LunchOrderCtorBean {

	private String bread;
	private String condiments;
	private String dressings;
	private String coldDrinks;
	private String dessert;

	public LunchOrderCtorBean(String bread) {
		this.bread = bread;
	}

	public LunchOrderCtorBean(String bread, String condiments) {
		this(bread);
		this.condiments = condiments;
	}

	public LunchOrderCtorBean(String bread, String condiments, String dressings) {
		this(bread, condiments);
		this.dressings = dressings;
	}

	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getDressings() {
		return dressings;
	}

	public String getColdDrinks() {
		return coldDrinks;
	}

	public String getDessert() {
		return dessert;
	}

}
