package com.garage;

public class VitreElectrique implements Option {

	
	double price;
	String optionName;
	
	 
	
	/**
	 * Constructor
	 */
	public VitreElectrique() {
		this.price = 500.2;
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
