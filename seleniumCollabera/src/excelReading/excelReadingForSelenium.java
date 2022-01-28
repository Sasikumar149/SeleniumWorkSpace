package excelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelReadingForSelenium {
	/*
	 * @author sasikumar A
	 */
	static String  exPath="./TestResources/testExcel.xlsx";

	/**
	 * This Method Is Used Read The String Data From Excel File
	 * @param sheetname Provide The Sheetname Where You Have Test Data
	 * @param row Provide The Row Number Where You Have Test Data 
	 * @param cell Provide The Cell Number Where You Have Test Data
	 * @return  It Returns The Data In That Respective Sheet, Row, Cell in the from of String 
	 */

	public static String readStringData(String sheetName, int row, int cell) {
		Workbook workbook= null;

		try {
			File absPath= new File(exPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook=WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return workbook.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();

	}



	/**
	 * This Method Is Used Read The Numeric Data From Excel File
	 * @param sheetname Provide The Sheetname Where You Have Test Data
	 * @param row Provide The Row Number Where You Have Test Data 
	 * @param cell Provide The Cell Number Where You Have Test Data
	 * @return  It Returns The Data In That Respective Sheet, Row, Cell in the from of Double 
	 */

	public static double readNumericData(String sheetName, int row, int cell){
		Workbook workbook= null;



		try {
			File absPath= new File(exPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook= WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue();

	}




	/**
	 * This Method Is Used Read The LocalDateAndTime Data From Excel File
	 * @param sheetname Provide The Sheetname Where You Have Test Data
	 * @param row Provide The Row Number Where You Have Test Data 
	 * @param cell Provide The Cell Number Where You Have Test Data
	 * @return  It Returns The Data In That Respective Sheet, Row, Cell in the from of LocalDateTime
	 */

	public static LocalDateTime readDateData(String sheetName, int row, int cell){
		Workbook workbook= null;



		try {
			File absPath= new File(exPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook= WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(row).getCell(cell).getLocalDateTimeCellValue();

	}




	/**
	 * This Method Is Used Read The Boolean Data From Excel File
	 * @param sheetname Provide The Sheetname Where You Have Test Data
	 * @param row Provide The Row Number Where You Have Test Data 
	 * @param cell Provide The Cell Number Where You Have Test Data
	 * @return  It Returns The Data In That Respective Sheet, Row, Cell in the from of Boolean 
	 */

	public static boolean readBooleanData(String sheetName, int row, int cell){
		Workbook workbook= null;



		try {
			File absPath= new File(exPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook= WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(row).getCell(cell).getBooleanCellValue();

	}
}