package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/frames");
	WebElement frameA = driver.findElement(By.id("frame1"));
	driver.switchTo().frame(frameA);
	String head= driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(head);
	driver.switchTo().defaultContent();
	WebElement frameB=driver.findElement(By.id("frame2"));
	driver.switchTo().frame(frameB);
	
	String head2=driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(head2);
	driver.quit();
}
}
