package com.garage;

public enum TypeMoteur {
	
	DIESEL("Diesel", 200.0),
	ESSENCE("Essence", 100.0),
	HYBRIDE("Hybride", 400.0),
	ELECTRIQUE("Electrique", 500.0);
	
	/** Variables
	 * 
	 */
	String type;
	double supplementTypeMoteur;
	
	/**
	 * Constructor
	 * @param type
	 * @param supTM
	 */
	
	private TypeMoteur(String type, double supTM) {
		
		this.type = type;
		this.supplementTypeMoteur = supTM;
	}
	
	
	public String getTypeMoteur() {
		return type;
	}
	/**
	 * 
	 * @return supplementTypeMoteur
	 */
	
	public double getEnumSuplTypeMoteur() {
		return supplementTypeMoteur;
	}
	
}
