package launchingBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Xpath2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
//	driver.get("https://demowebshop.tricentis.com/");
//	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//input[@value='Search']/preceding-sibling::input")).sendKeys("roshni");
//	
//	Thread.sleep(2000);
//	
//    WebElement ele= driver.findElement(By.linkText("Register"));
//	driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(ele)).click();
//	
//	
//	driver.get("https://demo.vtiger.com/vtigercrm/");
//	WebElement un= driver.findElement(By.id("username"));
//	WebElement pw= driver.findElement(By.id("password"));
//	un.clear();
//	pw.clear();
//	Thread.sleep(2000);
//	un.sendKeys("Roshni");
//	Thread.sleep(2000);
//	pw.sendKeys("123");
//	Thread.sleep(2000);
//	driver.findElement(By.className("buttonBlue")).click();
//	
//	System.out.println(driver.findElement(By.id("validationMessage")).getText());
//	
//	
	driver.get("https://www.actitime.com/");
	driver.manage().window().maximize();
	System.out.println(driver.findElement(By.linkText("Try actiTIME for Free")).getTagName());
}                      
}
