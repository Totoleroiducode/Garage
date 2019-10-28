package com.garage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class UtilsVehicules {
	
	

	 public  static String absoluteFilePath ;
	 
	/**
	 * Constructor
	 * @param v
	 * @return
	 */
	public  String toStringCSV(Vehicule v) {
		
		return v.getMarque().toString()+ v.nom +  v.moteur.getCylindre() + v.tMoteur.getTypeMoteur() + v.tMoteur.getEnumSuplTypeMoteur() + v.getOptions() + v.CalcFullPriceVehicule();
		
	}
	
	/** 
	 * @param nomFile
	 */
	public static void createCsvFile(String nomFile) {
		    //Nous déclarons nos objets en dehors du bloc try/catch
		    BufferedOutputStream bos; 
//		    FileOutputStream fos = null;

		       File file;
	  try {
		 
		  file = new File (nomFile);
		  if(file != null) {
			  System.out.println(file);
		  }
		  
		      bos = new BufferedOutputStream(new FileOutputStream(file));
		       absoluteFilePath = file.getAbsolutePath();
		       System.out.println(absoluteFilePath);
		      bos.close();
		                
		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }   
	 
		  }
		
	
	/**
	 * 
	 * @param g
	 * @return
	 */
	 
	 
	
	public static String [][] convertListToArray(Garage g) {

		
		List <String []> voitStr = new ArrayList <> ();
		
		g.getVoitures().forEach(elm -> {			
			voitStr.add(toStringforCsv(elm));
			});
	
		//
		String [][]voitStrArray= new  String[g.getVoitures().size()][];
	voitStrArray = voitStr.toArray(voitStrArray);
		
		 for(int i =0 ; i < voitStrArray.length; i ++) {
			  System.out.println("Valeur N°" + i + "est :" + voitStrArray[i]);
		  }
		
		return voitStrArray;	
	}
	
	/**
	 * 
	 * @param v
	 * @return
	 */
	
public static String[] toStringforCsv(Vehicule v) {
		String [] a = {v.getMarque().toString(), v.nom,  v.moteur.getCylindre(), v.tMoteur.getTypeMoteur(),v.getOptions().toString(), v.CalcFullPriceVehicule().toString()};
		return a;

	}
		
	
	public static void CSVHelper (File file) {
		
		
		
	}

	
	public static void CSVWriterDataLineByLine(String filePath, String[][] strArray) throws IOException {
		
		
		CSVWriter writer = new CSVWriter(new FileWriter(filePath), ';',CSVWriter.DEFAULT_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
	     // feed in your array (or convert your data to an array)
	
		for (String[] array: strArray) {
			writer.writeNext(array);
		}
	    
	     writer.flush();
	     writer.close();
		
	}
	
	
}
