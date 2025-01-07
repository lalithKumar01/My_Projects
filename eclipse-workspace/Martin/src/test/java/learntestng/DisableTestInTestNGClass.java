package learntestng;

import org.testng.annotations.Test;

public class DisableTestInTestNGClass {
	//enabled argument will make the test not to participate in the current execution even after 
	// calling @Test.
	// This works like local switch to, not to push the test for the execution
	@Test (priority = 1, invocationCount = 10)
	public void mangoTest() {
		System.out.println("mangoTest");
	}
	@Test(priority = 5, enabled = false)
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
