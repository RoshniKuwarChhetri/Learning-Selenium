package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blinkit {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.blinkit.com");
		driver.manage().window().maximize();
		driver.findElement(By.tagName("button")).click();
		System.out.println(driver.getPageSource());
	}
}
