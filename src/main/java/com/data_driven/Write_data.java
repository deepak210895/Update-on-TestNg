package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\maven\\src\\main\\java\\com\\data_driven\\Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet createSheet = w.createSheet("automationdata5");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("email");
		w.getSheet("automationdata5").getRow(0).createCell(1).setCellValue("1234@gdgh");
		w.getSheet("automationdata5").createRow(1).createCell(0).setCellValue("password");
		w.getSheet("automationdata5").getRow(1).createCell(1).setCellValue("12345");
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		w.close();
		System.out.println("finish");
	}

}
