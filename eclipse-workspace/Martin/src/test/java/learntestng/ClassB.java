package learntestng;

import org.testng.annotations.Test;

public class ClassB {
	@Test(groups = {"smoke"})
	public void nameA() {
		System.out.println("nameA");
	}
	@Test(groups = {"adhoc", "usability", "globalization"})
	public void nameB() {
		System.out.println("nameB");
	}
	@Test(groups = {"adhoc", "compatability"})
	public void nameC() {
		System.out.println("nameC");
	}
	@Test(groups = {"acceptance", "smoke"})
	public void nameD() {
		System.out.println("nameD");
	}
}
