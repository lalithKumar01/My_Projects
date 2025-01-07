package learntestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyScriptOnFaceBook {
	@Test(priority = 2)
	public void sendFriendRequest() {
		System.out.println("sendFriendRequest");
	}

	@Test(priority = 1)
	public void uploadPhoto() {
		System.out.println("Upload Photo.");
	}

	@Test(priority = 3)
	public void likePhoto() {
		System.out.println("likePhoto");
	}

	@Test(priority = 4)
	public void commentPhoto() {
		System.out.println("commentPhoto");
	}

	@BeforeMethod
	public void login() {
		System.out.println("login");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
}
