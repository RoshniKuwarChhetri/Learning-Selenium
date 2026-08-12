package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
    
	Home home= new Home(driver);
	home.getRegisterLink().isDisplayed();
	driver.navigate().refresh();
	home.getRegisterLink().click();
	
	Login login =new Login(driver);
	login.getGender().click();
	login.getName().sendKeys("Roshni");
	login.getLastName().sendKeys("kuwar chhetri");
	login.getEmail().sendKeys("123@gmail.com");
	login.getPassword().sendKeys("12345678");
	login.getConfirmPassword().sendKeys("12345678");
}
}
