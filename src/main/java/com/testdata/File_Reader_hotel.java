package com.testdata;

import java.io.IOException;

public class File_Reader_hotel {
	
	private File_Reader_hotel() {
     ////restrict to create object for File Reader Manager
	}
	
	public static File_Reader_hotel getInstanceFRM() {
		File_Reader_hotel reader = new File_Reader_hotel();
		return reader;
		
	}
	public  Configuration_Reader_hotel getInstanceCR() throws Throwable {
		Configuration_Reader_hotel reader = new Configuration_Reader_hotel();
		return reader;
		
	}


}
