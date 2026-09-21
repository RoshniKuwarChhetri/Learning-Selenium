package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
     @Test
	public void verifyText() {
		String actual="amazon";
		String expected="amazon";
		Assert.assertEquals(actual, expected);
		System.out.println("text is correct");
	}
     
     @Test
     public void verifyLogin() {

         boolean loginStatus = true;

         Assert.assertTrue(loginStatus);

         System.out.println("Login successful");
     }

     @Test
     public void verifyLogout() {

         boolean logoutStatus = false;

         Assert.assertFalse(logoutStatus);

         System.out.println("Logout verification passed");
     }
}
