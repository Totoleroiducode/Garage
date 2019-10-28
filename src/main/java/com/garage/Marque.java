package com.garage;

public enum Marque {
	
	RENO("Renault"),
	PIGEOT("Peugeot"),
	TROEN("Citroen");

	 String nm;
	
	
	private Marque(String brandName) {
		
		this.nm = brandName;
	}

	public String getEnumNameMarque() {
		return  nm;
	}
	
	
	
	
}
