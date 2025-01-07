package learntestng;

import org.testng.annotations.Test;

public class ClassA {
	@Test(groups = { "adhoc", "smoke" })
	public void nameE() {
		System.out.println("nameE");
	}

	@Test(groups = { "smoke", "regression" })
	public void nameF() {
		System.out.println("nameF");
	}

	@Test(groups = { "functional", "adhoc", "smoke" })
	public void nameG() {
		System.out.println("nameG");
	}

	@Test(groups = { "integration", "smoke", "adhoc" })
	public void nameH() {
		System.out.println("nameH");
	}

	@Test(groups = "reliability")
	public void nameI() {
		System.out.println("nameI");
	}
}
