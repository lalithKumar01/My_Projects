package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class KnowYourCellType {
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("./src/test/resources/fbdropdowndata.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("options");
	int rowCountIndex = sheet.getLastRowNum();
	// System.out.println(rowCountIndex);
	for (int i = 0; i <= rowCountIndex; i++) {
		Row row = sheet.getRow(i);
		CellType cellType = row.getCell(0).getCellType();
		System.out.println(cellType);
		
		
	}
}
}
