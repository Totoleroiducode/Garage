package com.garage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileHelper {

	public static List<String> readFile(File file) throws IOException {
		
		List <String> result =  new ArrayList<>();
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		try {
			for( String line = br.readLine(); line != null; line = br.readLine() ) {
				result.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		br.close();
		fr.close();
		
		return result;
		
		
	}

}
