package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeClickable {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/buttons");
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click Me']"))).click();
    String text=driver.findElement(By.id("dynamicClickMessage")).getText();
    System.out.println(text);
    driver.close();
   
    
}
}
