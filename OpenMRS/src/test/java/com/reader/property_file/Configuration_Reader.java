package com.reader.property_file;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;
	
	public Configuration_Reader() throws IOException {
//		D:\\Eclipse Workspace D\\com.OpenMRS\\Configuration\\property_File.properties
		File file = new File("D:\\Eclipse Workspace D\\op\\OpenMRS_A\\Configuration\\property_File.properties");
		
		FileInputStream fis = new FileInputStream(file);
		
		p = new Properties();
		
		p.load(fis);
	}
	
public String getproperty(String string) {
		
		
		String property = p.getProperty(string);
		
		return property;
		
	}

//public String geturl() {
//	
//	
//	String browser = p.getProperty("url");
//	
//	return browser;
//	
//}
}
