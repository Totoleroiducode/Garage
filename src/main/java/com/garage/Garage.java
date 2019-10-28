package com.garage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	Marque marque;

	/**
	 *  vehicule list 
	 */
	 List <Vehicule> voitures ;
	 
	public Garage() {
		voitures = new ArrayList<>() ; 
	}
	
	public String toString() {
		
		return "o,io,oi";
		
	}
	
	
	 /**
	 * @return the voitures
	 */
	public List<Vehicule> getVoitures() {
		return voitures;
	}

	/**
	 * @param voitures the voitures to set
	 */
	public void setVoitures(List<Vehicule> voitures) {
		this.voitures = voitures;
	}

	/**
	  *  Add vehicules 
	  * @param voit
	  */
	 private void addVehicule(Vehicule voit) {
		 
		 voitures.add(voit);
		 
	 }
	 
	 /**
	  * Show all the cars in the garage 
	  * @param g
	  */
	 
	 public void  parcourGarage(Garage g) {
		 System.out.println("Voici les voitures de notre garage");
		 for(int i = 0; i <voitures.size(); i++) {
			 System.out.println(g.voitures.get(i) + "\n");
		 }
		
	 }

	 /**
	  *  If the car wanted by the client is in the garage find it and take it out
	  * @param voitASortir
	  * @return
	  */
	 protected  void sortirGarage(String voitASortir) {
		 
		 voitures.stream().forEach(voit ->{ if(voit.getMarque().getEnumNameMarque().equals(voitASortir)) {
			 System.out.println(voit.toString());
		 } });
		
		 }
	 
//	 List <String[]> listStr = new  ArrayList<>();
//	 String [] strArray = {"Hello everybody","How are you"};
	 
//	 listStr.add(hello);
	 
	 
 	 
	 
	 
//	 public void writeToCsvFile(List<String[]> thingsToWrite, String separator, String fileName){
//	        try (FileWriter writer = new FileWriter(fileName)){
//	            for (String[] strings : thingsToWrite) {
//	                for (int i = 0; i < strings.length; i++) {
//	                    writer.append(strings[i]);
//	                    if(i < (strings.length-1))
//	                        writer.append(separator);
//	                }
//	                writer.append(System.lineSeparator());
//	            }
//	            writer.flush();
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	    }
//		 
		 
		
	 }


