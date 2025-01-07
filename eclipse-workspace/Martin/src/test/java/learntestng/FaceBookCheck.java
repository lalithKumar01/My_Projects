package learntestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBookCheck {
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

	@Test(dependsOnMethods = "uploadProfilePic")
	public void sendFriendRequest() {
		System.out.println("sendFriendRequest");
	}

	@BeforeClass
	public void signIn() {
		System.out.println("signIn");
	}

	@Test
	public void uploadProfilePic() {
		System.out.println("uploadProfilePic");
	}

	@BeforeMethod
	public void login() {
		System.out.println("login");
	}

	@Test(dependsOnMethods = { "uploadProfilePic", "sendFriendRequest" })
	public void acceptFreindRequest() {
		System.out.println("acceptFreindRequest");
	}

}
