package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Row_Data {
	public static void row_Data() throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\maven\\src\\main\\java\\com\\data_driven\\Book1.xlsx");
       FileInputStream fis = new FileInputStream(f);
       Workbook w = new XSSFWorkbook(fis);
       Sheet sheetAt = w.getSheetAt(0);
       Row row = sheetAt.getRow(0);
       int numberOfCells = row.getPhysicalNumberOfCells();
       for (int i = 0; i <numberOfCells ; i++) {
    	   Cell cell = row.getCell(i);
    	   CellType cellType = cell.getCellType();
    	   if (cellType.equals(CellType.STRING)) {
    		   String cellValue = cell.getStringCellValue();
    		   System.out.println(cellValue);
			
		} 
    	   else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);
		}
    	
		
	}  
	}
	public static void main(String[] args) throws IOException {
		row_Data();
	}

}
