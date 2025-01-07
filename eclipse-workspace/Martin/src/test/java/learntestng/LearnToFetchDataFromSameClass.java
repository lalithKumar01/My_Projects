package learntestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnToFetchDataFromSameClass {
	@Test(dataProvider = "iHaveData")
	public void supplyDataToMe(String src, String dest, String noOfTickets, String phNum) {
		System.out.println(" From=>> " + src + " To Address=>> " + dest + " No Of tickets=>> " + noOfTickets + " phone No: =>> " + phNum);
	}
	@DataProvider
	public Object iHaveData() {
		Object[][] obj = new Object[4][4];
		obj[0][0]="Belgavi";
		obj[0][1]="Bangalore";
		obj[0][2]="2";
		obj[0][3]="123456789";
		
		obj[1][0]="Huballi";
		obj[1][1]="Bangalore";
		obj[1][2]="23";
		obj[1][3]="098765432";
		
		obj[2][0]="Kalburgi";
		obj[2][1]="Bangalore";
		obj[2][2]="2";
		obj[2][3]="123456789";
		
		obj[3][0]="shimoga";
		obj[3][1]="Bangalore";
		obj[3][2]="2";
		obj[3][3]="123456789";
		return obj;
	}
}
