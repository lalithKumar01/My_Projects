package datadriventesting;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDOwnOrderCheck {
	public static void main(String[] args) throws Throwable {
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
					long numericData = (long) cell.getNumericCellValue();
					// System.out.println(numericData);
					if (cellCount == 31) {
						expectedDayList.add(String.valueOf(numericData));
					} else if (cellCount == 119) {
						expectedYearList.add(String.valueOf(numericData));
					}
				} else if (cellType.toString().equals("STRING")) {
					String stringData = cell.getStringCellValue();
					// System.out.println(stringData);
					expectedMonthList.add(stringData);
				}
			}
		}
		workbook.close();
		List<String> actualDayList = new ArrayList<String>();
		List<String> actualMonthList = new ArrayList<String>();
		List<String> actualYearList = new ArrayList<String>();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		Select daySelect = new Select(driver.findElement(By.id("day")));
		for (WebElement dayOpt : daySelect.getOptions()) {
			String dayName = dayOpt.getText();
			actualDayList.add(dayName);
		}
		Select monthSelect = new Select(driver.findElement(By.id("month")));
		for (WebElement monthOpt : monthSelect.getOptions()) {
			String monthName = monthOpt.getText();
			actualMonthList.add(monthName);
		}
		Select yearSelect = new Select(driver.findElement(By.id("year")));
		for (WebElement yearOpt : yearSelect.getOptions()) {
			String yearName = yearOpt.getText();
			actualYearList.add(yearName);
		}
		System.out.println(actualDayList);
		System.out.println(expectedDayList);
		if (actualDayList.equals(expectedDayList)) {
			System.out.println(
					"Pass: The Day Options order in the Dropdown List box is found correct and it is verified.");
		} else {
			System.out.println(
					"Fail: The Day Options order in the Dropdown List box is found incorrect and it is verified.");
		}
		System.out.println(actualMonthList);
		System.out.println(expectedMonthList);
		if (actualMonthList.equals(expectedMonthList)) {
			System.out.println(
					"Pass: The Month Options order in the Dropdown List box is found correct and it is verified.");
		} else {
			System.out.println(
					"Fail: The Month Options order in the Dropdown List box is found incorrect and it is verified.");
		}
		System.out.println(actualYearList);
		System.out.println(expectedYearList);
		if (actualYearList.equals(expectedYearList)) {
			System.out.println(
					"Pass: The Year Options order in the Dropdown List box is found correct and it is verified.");
		} else {
			System.out.println(
					"Fail: The Year Options order in the Dropdown List box is found incorrect and it is verified.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
