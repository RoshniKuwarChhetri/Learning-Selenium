package launchingBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement element= driver.findElement(By.xpath("//a[@class='ico-login']"));
	element.click();
	Thread.sleep(2000);
	String textElement=driver.findElement(By.xpath("//div[contains(text(),'By creating an account on our website you will be able to shop faster,')]")).getText();
    System.out.println(textElement);
    Thread.sleep(2000);
    
    //Surrounding 
    driver.manage().window().maximize();
    driver.get("https://www.makemytrip.com/");
    Thread.sleep(9000);
    driver.findElement(By.cssSelector("span[data-cy='closeModal']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//label[@for='departure']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='July']/../..//p[text()='6']")).click();
    Thread.sleep(2000);
    
    driver.close();
}
}
