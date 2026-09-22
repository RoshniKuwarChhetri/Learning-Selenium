package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {

	@Test
	@Parameters("browser")
	public void testBrowser(String browser) {
		System.out.println(browser+" correct browser");
	}
}
