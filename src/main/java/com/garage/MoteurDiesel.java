package com.garage;

public class MoteurDiesel extends Moteur {
	
	String typeMoteur;
	

	public MoteurDiesel(String cylindre) {
		
		super(cylindre);
		this.typeMoteur = " Moteur Diesel";
		
	}


	/**
	 * @return the typeMoteur
	 */
	public String getTypeMoteur() {
		return typeMoteur;
	}
	
	/**
	 * Design patern: command,visitor,factory,abstract factory, 
	 */

}
