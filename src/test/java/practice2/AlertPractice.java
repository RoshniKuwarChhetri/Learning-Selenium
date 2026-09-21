package practice2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://the-internet.herokuapp.com/javascript_alerts?utm_source=chatgpt.com");
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	driver.switchTo().alert().sendKeys("hi");
	driver.switchTo().alert().accept();
	

}
}


//