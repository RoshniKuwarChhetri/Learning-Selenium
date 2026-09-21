package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://the-internet.herokuapp.com/iframe?utm_source=chatgpt.com");
	 driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
	WebElement content= driver.findElement(By.tagName("body"));
			content.clear();
			content.sendKeys("hiiii");
			driver.switchTo().defaultContent();
	
}
}
