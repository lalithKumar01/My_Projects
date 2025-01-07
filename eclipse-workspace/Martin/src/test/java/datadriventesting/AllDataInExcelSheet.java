package datadriventesting;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllDataInExcelSheet {
	public static void main(String[] args) throws Throwable, Throwable {
		List<String> expectedDayList = new ArrayList<String>();
		List<String> expectedMonthList = new ArrayList<String>();
		List<String> expectedYearList = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("./src/test/resources/fbdropdowndata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("options");
		int rowCountIndex = sheet.getLastRowNum();
		// System.out.println(rowCountIndex);
		for (int i = 0; i <= rowCountIndex; i++) {
			Row row = sheet.getRow(i);
			short cellCount = row.getLastCellNum();
			// System.out.println(cellCount);
			for (short j = 0; j <= cellCount - 1; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.toString().equals("NUMERIC")) {
					long numericData = (long)cell.getNumericCellValue();
					//System.out.println(numericData);
					if (cellCount == 31) {
						expectedDayList.add(String.valueOf(numericData));
					} else if (cellCount == 119) {
						expectedYearList.add(String.valueOf(numericData));
					}
				} else if (cellType.toString().equals("STRING")) {
					String stringData = cell.getStringCellValue();
					//System.out.println(stringData);
					expectedMonthList.add(stringData);
				}
			}
		}
		workbook.close();
		System.out.println(expectedDayList);
		System.out.println(expectedMonthList);
		System.out.println(expectedYearList);
	}
}
