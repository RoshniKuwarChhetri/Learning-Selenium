package part1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	driver.get("https://demowebshop.tricentis.com/");
	String id=driver.getWindowHandle();
	driver.findElement(By.linkText("Gift Cards")).click();
	Set<String> ids=driver.getWindowHandles();
	for(String no : ids) {
		if(!no.equals(id)) {
			driver.switchTo().window(id);
			System.out.println(id);
		}
	}
}
}
