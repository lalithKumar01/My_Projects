package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			//Create the object of FileInputStream of Java w.r.t String File Name
			FileInputStream fis = new FileInputStream("./src/test/resources/fbdropdowndata.xlsx");
			// Call the WorkBookFactory and call the create(inputStream ObjRef)
			Workbook workBook = WorkbookFactory.create(fis);
			Sheet sheet = workBook.getSheet("options");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			String data = cell.getStringCellValue();
			System.out.println(data);
			workBook.close();
		}
}
