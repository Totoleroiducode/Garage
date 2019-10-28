package com.garage;

public class MoteurHybride  extends Moteur{

	
	String typeMoteur;
	
	public MoteurHybride(String cylindre) {
		
		super(cylindre);
		this.typeMoteur = "Moteur Electrique";
	}
	
	/**
	 * @return the typeMoteur
	 */
	public String getTypeMoteur() {
		return typeMoteur;
	}

}
