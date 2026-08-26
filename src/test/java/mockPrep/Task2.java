package mockPrep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/?utm_source=chatgpt.com");
    driver.findElement(By.linkText("Dynamic Controls")).click();	
    driver.findElement(By.xpath("//button[text()=\"Remove\"]")).click();
    
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("checkbox"))));
    driver.findElement(By.xpath("//button[text()=\"Add\"]")).click();
    
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("checkbox"))));
        
}
}
