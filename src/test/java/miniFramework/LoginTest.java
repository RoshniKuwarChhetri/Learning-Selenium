package miniFramework;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
public class LoginTest extends BaseTest {

	@Test
	public void ValidLoginTest() {
		driver.findElement(By.id("import org.testng.annotations.Test;")).sendKeys("Roshni");
		driver.findElement(By.id("password")).sendKeys("12345678910");
		driver.findElement(By.id("login-button")).click();
		
		
	}
	
}
//