package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DaraProviderDemo {

	@DataProvider(name="LoginData")
	public Object[][] getLoginData(){
		return new Object[][] {{"roshni", "123"},{"karan","345"},{"rose","567"}};	
	}
	@Test(dataProvider="LoginData")
	public void loginTest(String un, String pw) {
		System.out.println("username is "+ un + " and password is "+pw);
		System.out.println("login Successful");
		System.out.println("🤩😍😍😍");
	}
}
