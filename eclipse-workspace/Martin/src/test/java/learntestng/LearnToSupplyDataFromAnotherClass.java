package learntestng;

import org.testng.annotations.Test;

public class LearnToSupplyDataFromAnotherClass {
	@Test(dataProvider = "iHaveDataWithMe", dataProviderClass = DataProviderClass.class)
	public void supplyDataToMe(String src, String dest, String noOfTickets, String phNum) {
		System.out.println(" From=>> " + src + " To Address=>> " + dest + " No Of tickets=>> " + noOfTickets
				+ " phone No: =>> " + phNum);
	}
}
