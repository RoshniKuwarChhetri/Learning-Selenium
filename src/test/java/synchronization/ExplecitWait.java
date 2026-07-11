package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplecitWait {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/text-box");
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName"))).sendKeys("Roshni");
	
	driver.close();
	
}
}
