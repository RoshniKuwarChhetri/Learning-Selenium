package launchingBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email"))
	.sendKeys("Roshni");
	//Thread.sleep(1000);
	driver.findElement(By.id("_R_1hmkqsqppb6amH1_")).sendKeys("123");
    Thread.sleep(3000);
    
    driver.findElement(By.className("x1ja2u2z")).click();
    Thread.sleep(2000);
    driver.findElement(By.partialLinkText("Forgotten")).click();
    Thread.sleep(2000);
    driver.get("https://chatgpt.com/");
    Thread.sleep(2000);
    
    
    
    driver.close();
   
    
}

}
