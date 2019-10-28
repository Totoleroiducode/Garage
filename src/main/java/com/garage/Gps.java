package com.garage;

public class Gps implements Option  {

	double price;
	String optionName = "GPS";
	/**
	 * Constructor
	 * @param prix
	 */
	public Gps() {
		this.price = 150.25;
		this.optionName = "GPS";
	}
	@Override
	public Double getPrice() {
		
		return price;
	}
	
	public String toString() {
		return this.optionName + " " + this.price + "€";
	}

	
}
