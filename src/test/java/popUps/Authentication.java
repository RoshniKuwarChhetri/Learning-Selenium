package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	String msg=driver.findElement(By.tagName("p")).getText();
	if(msg.contains("Congratulations!")) {
		System.out.println("Test Passed");
	}
	else {
		System.out.println("Test Failed");
	}
	driver.close();
}
}
