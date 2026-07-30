package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//span[text()=\"HP 14 Smartchoice, Intel Core Ultra 5 125H 12 TOPS, 24GB DDR5 (Upgradeable) 1TB SSD, Anti-Glare, FHD, 14''/35.6cm,Win11, M365*Office24, Silver, 1.4kg, ep1180tu, FHD Camera w/Shutter, Backlit AI Laptop\"]/../../../..//span[text()=\"77,990\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@id=\"a-autoid-0-announce\"]/../../../../../../../../../..//input[@id=\"add-to-cart-button\"]")).click();	
	driver.navigate().back();
	
}
}
