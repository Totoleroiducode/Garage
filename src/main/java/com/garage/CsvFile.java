package com.garage;

import java.io.File;
import java.util.List;

public interface CsvFile {
	
	File getFile();
	
	List <String []> getData();

}
