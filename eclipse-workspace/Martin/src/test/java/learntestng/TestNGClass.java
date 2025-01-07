package learntestng;

import org.testng.annotations.Test;

public class TestNGClass {
// @test acts like a main method
	// @test can be called upon the method 
	// Here each method is representing the each test case
	// testcase name should be unique and it should be independent
	// testcase name should be the method name in the automation script
	//NOTE: the moment we Call @test annotation upon  a method in the class it will become 
	//testngClass
	@Test
	public void mangoTest() {
		System.out.println("mangoTest");
	}
	public void appleTest() {
		System.out.println("appleTest");
	}
	public void bananaTest() {
		System.out.println("bananaTest");
	}
	public void orangeTest() {
		System.out.println("orangeTest");
	}
	public void grapesTest() {
		System.out.println("grapesTest");
	}
}
