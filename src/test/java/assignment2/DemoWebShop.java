package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("About us")).click();
	String title="Demo Web Shop. About Us";
	if(title.equals(driver.getTitle())) {
		System.out.println("Pass");
	}else {
		System.out.println("fail");
	}
	driver.quit();
	
	
}
}
