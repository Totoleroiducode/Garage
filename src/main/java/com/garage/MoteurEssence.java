package com.garage;

public class MoteurEssence extends Moteur {
	
	String typeMoteurEssence;
	/**
	 * Constructor
	 * @param cylindre
	 * @param tMoteurEssence
	 */

	public MoteurEssence(String cylindre) {
		
		super(cylindre);
		
		this.typeMoteurEssence = "Moteur Essence";
	}
	
	public String getTypeMoteurEssence() {
		return this.typeMoteurEssence;
	}
	

	

}
