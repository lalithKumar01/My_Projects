package com.trello.qspiders.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class will be used to read the data from excel sheet
 * @author QCSM19
 *
 */
public class ExcelUtility {
	/**
	 * @author Chandan N R
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return StringvalueFromCell
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readStringData(String sheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/fbdropdowndata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		return value;
	}

	/**
	 * This method will help to read the numeric data from the excel sheet
	 * 
	 * @author Chandan N R
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return numericCellValue
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double readNumericData(String sheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/fbdropdowndata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		double value = cell.getNumericCellValue();
		return value;
	}

}
