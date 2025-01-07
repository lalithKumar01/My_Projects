package learntestng;

import org.testng.annotations.Test;

public class WhatIfTestCalledMultipleTimes {
	
	// @test will conduct the default order by following the alphabets
	// Alphabetical order by default
	//We can test annotation multiple times in the same class
	
	@Test
	public void mangoTest() {
		System.out.println("mangoTest");
	}
	@Test
	public void appleTest() {
		System.out.println("appleTest");
	}
	@Test
	public void bananaTest() {
		System.out.println("bananaTest");
	}
	@Test
	public void orangeTest() {
		System.out.println("orangeTest");
	}
	@Test
	public void grapesTest() {
		System.out.println("grapesTest");
	}
}
