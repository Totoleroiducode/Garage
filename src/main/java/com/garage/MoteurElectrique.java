package com.garage;

public class MoteurElectrique extends Moteur {

	String typeMoteur;

	public MoteurElectrique(String cylindre) {
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