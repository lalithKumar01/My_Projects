package learntestng;

import org.testng.annotations.Test;

public class UserDefinedOrderofExecution {
	//Priority Is an argument can be used along with @Test
	// This will be used  to define the user defined order of execution.
	//default value is Zero
	// -ve int values will be auto nullified it will go with alphabetical order.
	// -ve and zero is base less to prioritize.
	
	@Test(priority = 1)
	public void mangoTest() {
		System.out.println("mangoTest");
	}
	@Test(priority = 5)
	public void appleTest() {
		System.out.println("appleTest");
	}
	@Test(priority = 2)
	public void bananaTest() {
		System.out.println("bananaTest");
	}
	@Test(priority = 4)
	public void orangeTest() {
		System.out.println("orangeTest");
	}
	@Test(priority = 3)
	public void grapesTest() {
		System.out.println("grapesTest");
	}
}
