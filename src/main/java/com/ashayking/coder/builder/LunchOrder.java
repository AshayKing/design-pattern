package com.ashayking.coder.builder;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class LunchOrder {

	public static class Builder {

		private String bread;
		private String condiments;
		private String dressings;
		private String coldDrinks;
		private String dessert;

		/**
		 * We can parameterize it depending on requirement
		 */
		public Builder() {

		}

		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}

		public Builder dressings(String dressings) {
			this.dressings = dressings;
			return this;
		}

		public Builder coldDrinks(String coldDrinks) {
			this.coldDrinks = coldDrinks;
			return this;
		}

		public Builder dessert(String dessert) {
			this.dessert = dessert;
			return this;
		}

		public LunchOrder build() {
			return new LunchOrder(this);
		}
	}

	private String bread;
	private String condiments;
	private String dressings;
	private String coldDrinks;
	private String dessert;

	public LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressings = builder.dressings;
		this.coldDrinks = builder.coldDrinks;
		this.dessert = builder.dessert;
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
