package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AlwaysRunDemo {

	@Test(alwaysRun = false)
	public void loginTest() {
		System.out.println("start test");
	}
	
	@Test(dependsOnMethods = "loginTest" )
	public void searchTest() {
		System.out.println("search test");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("taer down");
	}
	
}
