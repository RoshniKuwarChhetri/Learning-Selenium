package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zepto {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.zepto.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[text()=\"Search for\"]")).click();
	Thread.sleep(4000);
	WebElement search= driver.findElement(By.xpath("//input[@placeholder=\"Search for over 5000 products\"]"));
	Thread.sleep(2000);
	search.sendKeys("kurkure",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()=\"₹4\"]/../../..//button[text()=\"ADD\"]")).click();
	Thread.sleep(1000);
	
	search.sendKeys(Keys.chord(Keys.CONTROL+"a"));
	search.sendKeys(Keys.DELETE);
	
	
	search.sendKeys("chips",Keys.ENTER);
	driver.findElement(By.xpath("//span[text()=\"₹3\"]/../../..//button[text()=\"ADD\"]")).click();
	Thread.sleep(2000);
	search.sendKeys(Keys.chord(Keys.CONTROL+"a"));
	search.sendKeys(Keys.DELETE);
	
	search.sendKeys("doritos",Keys.ENTER);
	driver.findElement(By.xpath("//span[text()=\"12₹\"]/../../..//button[text()=\"ADD\"]")).click();
	driver.close();
	
}
}
