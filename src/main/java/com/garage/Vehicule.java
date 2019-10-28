package com.garage;

import java.util.ArrayList;
import java.util.List;


public class Vehicule   implements Option {
	
	/**Variables
	 * 
	 */
	 protected Moteur moteur;
	 protected double prix;
	 protected String nom;
	 protected List <Option> options = new ArrayList<>();
	 protected Marque nomMarque;
	 protected TypeMoteur tMoteur;
	 protected Garage garage;
	 protected int nbreVehicule = 0;
	
	
	/**
	 * Constructor
	 * @param price
	 * @param name
	 * @param brand
	 * @param type 
	 */
	public Vehicule(double pPrix, String name, Marque brand,Moteur m,TypeMoteur tm,Garage g ) {
		
		this.prix=pPrix;
		this.nom = name;
		this.nomMarque= brand;
		this.moteur = m;
		this.tMoteur = tm;
		nbreVehicule ++;
		
		if(nbreVehicule > 0) {
			
			g.voitures.add(this);
			
		}
		

	}
	
	/**
	 * 
	 * @returnn nomMarque
	 */
	public Marque getMarque() {
		return nomMarque;
	}
	

	/**
	 * @return the options
	 */
	public List<Option> getOptions() {
		return this.options;
	}
	
	public String toStringOpt() {
		return "";
	}
	
	public  String[] changeListToArray(List <String>lstStr) {
		
		String []strArray = new String[lstStr.size()];
		strArray =  lstStr.toArray(strArray);
		
		return strArray;
	}
	/**
	 * Ajouter une option au v�hicule.
	 * @param opt
	 */
	public void addOption(Option opt) {
		
		options.add(opt);
	}


	@Override
	public Double getPrice() {
		
		return this.prix;
	}
	/**
	 *  
	 * @return Prix du vehicule avec option
	 */
	
	protected Double CalcFullPriceVehicule() {
		
		 double  result = 0.0;
		 
		 // Loop through vehicule options 
		for(Option opt : options ) {
			 result+= opt.getPrice();
		}
		
		// Add motor's price and the extra bonus according to the motor's type
		result+= this.tMoteur.getEnumSuplTypeMoteur()+ this.getPrice() ;
		
		return result;
		
	}
	
	/**
	 * @param v
	 * @return  Price according to motor's type

	 */
//	public double calcPriceAccordingToTheMotorType( Vehicule v) {
//		 double  result = 0.0;
//		 
//		 switch (this.tMoteur) {
//		 
//		 case DIESEL:
//			 
//			 result = TypeMoteur.DIESEL.getEnumSuplTypeMoteur();
//			 break;
//		 case ESSENCE:
//			 result = TypeMoteur.ESSENCE.getEnumSuplTypeMoteur();
//			 break;
//		 case HYBRIDE:
//			 result = TypeMoteur.HYBRIDE.getEnumSuplTypeMoteur();
//			 break;
//		 case ELECTRIQUE:
//			 result = TypeMoteur.ELECTRIQUE.getEnumSuplTypeMoteur();
//			 break;
//	 
//		 };
//		 
//		 return result;
//	}
//	
//	
	// M�thode pour l'affichage des caract�ristiques de chaque vehicule
	
	public String toString() {
		
		return  "Voiture: " +  this.getMarque() + " " + this.nom +  " \n- Puissance: "+ this.moteur.getCylindre() + "\n- Type moteur:" + this.tMoteur.getTypeMoteur()  + "  \n- Options: " + this.getOptions() + "\n- Prix du véhicule avec option(s): " + this.CalcFullPriceVehicule() + " €" ; 
	}



}
