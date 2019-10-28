package com.garage;

public class BarreDeToit  implements Option{
	
	double price;
	String optionName;

	/**
	 * Constructor
	 * @param prix
	 */
	public BarreDeToit() {
		this.price = 74.2;
		this.optionName = "Barre de toit";
	}

	
	@Override
	public Double getPrice() {
		
		return this.price;
	}
	
	public String toString() {
		return this.optionName + " " + this.price + "€";
	}


}
