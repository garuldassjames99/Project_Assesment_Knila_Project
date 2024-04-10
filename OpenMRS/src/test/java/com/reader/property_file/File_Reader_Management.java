package com.reader.property_file;

import java.io.IOException;

public class File_Reader_Management {

	private File_Reader_Management() {

	}

	public static File_Reader_Management getInstanceFR() {
		
		File_Reader_Management reader= new File_Reader_Management();
		
		return reader;
		
	}
	public static Configuration_Reader getInstanceCR() throws IOException {
		
		Configuration_Reader helper = new Configuration_Reader();
		
		return helper;
	}
}
