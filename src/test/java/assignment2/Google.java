package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement search= 	driver.findElement(By.name("q"));
    search.sendKeys("Selenium");
    Thread.sleep(2000);
    search.clear();
    Thread.sleep(2000);
    search.sendKeys("Selenium");
    Thread.sleep(2000);
    search.submit();
    

    
}
}
