package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	@BeforeTest
	public void setup() {
		System.out.println("Before test");
	}
@Test
public   void loginTest(){
	System.out.println("login test executed");
}
@Test
public void registerTest() {
	System.out.println("Registeration test executed");
}
    @AfterTest
    public void tearDown() {
    	System.out.println("After test");
    }
}
