package operations;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	
	Actions actions =new Actions(driver); 
	WebElement ele = driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/books']"));
	actions.moveToElement(ele).perform();
	
	Thread.sleep(2000);
	driver.close();
}
}
