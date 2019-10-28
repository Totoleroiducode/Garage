package com.garage;

public abstract class Moteur {
/**
 * Variables
 */
	TypeMoteur typeM;
	String cylindre;
	

	/**
	 * Constructor
	 * @param t
	 * @param cl
	 * @param price
	 */
	public Moteur( String cl) {
		
		this.cylindre = cl;
		
	}


	public String getCylindre() {
		return this.cylindre;
	}
	
	
}
