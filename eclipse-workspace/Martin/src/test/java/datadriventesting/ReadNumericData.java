package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadNumericData {
public static void main(String[] args) throws Throwable, Throwable {
	FileInputStream fis =  new FileInputStream("./src/test/resources/fbdropdowndata.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	 long data = (long)workbook.getSheet("options").getRow(2).getCell(1).getNumericCellValue();
	System.out.println(data);
	workbook.close();
	
}
}
