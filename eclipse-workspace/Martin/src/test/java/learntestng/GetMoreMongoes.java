package learntestng;

import org.testng.annotations.Test;

public class GetMoreMongoes {
	// invocationCount defult value - 1
	// it will be used to execute the same test case multiple no of times

	@Test(priority = 1, invocationCount = 10)
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
