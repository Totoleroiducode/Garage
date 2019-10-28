package com.garage;

public class Climatisation implements Option {

	
	double price;
	String optionName;
	
	/**
	 * Constructor
	 */
	
	public Climatisation() {
		this.price = 892.2;
		this.optionName = "Vitres électriques";
	}

	
	
	@Override
	public Double getPrice() {
		
		return this.price;
	}
	
	public String toString() {
		return this.optionName + " " + this.price + "€";
	}

}
