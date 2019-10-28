package com.garage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainGarage {

	public static void main(String[] args) {
	
		Garage g = new Garage();
		 Garage g1 = new Garage();
		
		
		Vehicule v = new Vehicule(2.2,"306",Marque.PIGEOT, MoteurFactory.getMoteur("MoteurEssence", "12 cv"),TypeMoteur.ESSENCE,g);
		Vehicule v1 = new Vehicule(2.2,"306",Marque.TROEN, MoteurFactory.getMoteur("MoteurDiesel", "12 cv"),TypeMoteur.DIESEL,g);
		Vehicule v3 = new Vehicule(2.2,"306",Marque.TROEN, MoteurFactory.getMoteur("MoteurElectrique", "12 cv"),TypeMoteur.ELECTRIQUE,g);
		
		Vehicule v4 = new Vehicule(2.2,"306",Marque.TROEN, MoteurFactory.getMoteur("MoteurElectrique", "12 cv"),TypeMoteur.ELECTRIQUE,g1);
		Vehicule v5 = new Vehicule(2.2,"306",Marque.TROEN, MoteurFactory.getMoteur("MoteurElectrique", "12 cv"),TypeMoteur.ELECTRIQUE,g1);
		v.addOption(new Gps());
		
		g.sortirGarage("306");
		
		
		/**
		 * Utilisation des streams et de collect 
		 */
//		String [] tab = {"Hello", "papa"};
//		
//		List <String> list = Arrays.asList(tab);
//		
//		 String result = list.parallelStream().collect(StringBuilder::new,
//		    		(response, element) -> response.append(" ").append(element),
//		    		(response1, response2) -> response1.append(",").append(response2.toString()))
//		    		.toString();
//		    System.out.println("Result: " + result);
		    
//		    g.listStr.add(g.strArray);
		
//		    g.writeToCsvFile(g.listStr, " ,", "garage.csv");
////		    
		
		
		 
		
		 List <String> phrases = new ArrayList <>();
		 
		 phrases.add("toto");
		 phrases.add("tata");
		 phrases.add("titi");
		 
		  String [] phrasesArray = new String[phrases.size()];
		  phrasesArray = phrases.toArray(phrasesArray);
		  
		  
		 
		  String [][] convertedList = UtilsVehicules.convertListToArray(g);
		  
		     System.out.println( UtilsVehicules.convertListToArray(g));
  try {
	UtilsVehicules.CSVWriterDataLineByLine("garage.csv",convertedList);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
  UtilsVehicules.createCsvFile("toto.csv");
//		  
		 
//		 System.out.println(phrasesArray);
//		
		
		
		
		
		

	}

}
