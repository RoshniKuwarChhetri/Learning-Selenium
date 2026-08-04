package operations;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindow {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
	search.click();
	search.sendKeys("mobile");
	search.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	String id=driver.getWindowHandle();
System.out.println(id);
	driver.findElement(By.xpath("//span[text()=\"Apple iPhone 17 Pro Max 2 TB: 17.42 cm (6.9″) Display with Promotion, A19 Pro Chip, Best Battery Life in Any iPhone Ever, Pro Fusion Camera System, Center Stage Front Camera; Silver\"]")).click();
	
	Set<String> ids=driver.getWindowHandles();
	
	for(String a: ids) {
		if(!a.equals(id)) {
			driver.switchTo().window(a);
			System.out.println(a);
			
		}
	}
	Thread.sleep(5000);
  System.out.println(driver.getCurrentUrl());
driver.findElement(By.xpath("//div[@id=\"a-accordion-auto-6\"]//input[@id=\"add-to-cart-button\"]")).click();
	
}
}////input{@id="add-to-cart-button"]  

