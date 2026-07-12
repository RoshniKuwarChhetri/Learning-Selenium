package popUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeNewTab {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	String parent=driver.getWindowHandle();
	driver.findElement(By.id("tabButton")).click();
	Set<String> allWindow=driver.getWindowHandles();
	
	for(String curr: allWindow) {
		if(!curr.equals(parent)) {
			driver.switchTo().window(curr);
		}
	}
	
	System.out.println("chile handle"+ driver.getWindowHandle());
	System.out.println("child title"+ driver.getTitle());
	System.out.println("sixe "+allWindow.size());
	driver.close();
	
	driver.switchTo().window(parent);
	
	if(driver.getTitle().contains("DEMOQA")) {
		System.out.println("Parent Window Restored Successfully");
	}else {
		System.out.println("Parent Window Not Found");
	}
	
	driver.close();
	
}
}
