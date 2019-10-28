package com.garage;

public class MoteurFactory {
	

	public  static Moteur getMoteur(String motorType,  String cylindre) {
		
	String motorTypeLowerCase = motorType.toLowerCase();
	
	switch (motorTypeLowerCase) {
	case "moteuressence":
		return new MoteurEssence(cylindre);
	case "moteurelectrique":
		return new MoteurElectrique(cylindre);
	case "moteurhybride":
		return new MoteurHybride(cylindre);
	case "moteurdiesel":
		return new MoteurDiesel(cylindre);
	}
	
		return null;
		
	}

}
