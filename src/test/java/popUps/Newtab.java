package popUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtab {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	
	String parent= driver.getWindowHandle();
	driver.findElement(By.id("tabButton")).click();
	
	Set<String> allWindows= driver.getWindowHandles();
	
	for(String window1: allWindows) {
		if(!window1.equals(parent)) {
			driver.switchTo().window(window1);
		}
	}
	System.out.println(driver.getPageSource());
	System.out.println(driver.getCurrentUrl());
	String head= driver.findElement(By.id("sampleHeading")).getText();
	
	if(head.equals("This is a sample page")) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}
	driver.close();
	driver.switchTo().window(parent);
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.close();
	
}
}
