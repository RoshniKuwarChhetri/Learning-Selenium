package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blinkit {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.blinkit.com");
		driver.manage().window().maximize();
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("https://cdn.grofers.com/cdn-cgi/image/f=auto,fit=scale-down,q=70,metadata=none,w=225/layout-engine/2022-11/Slice-8_4.png")).click()
		
		;
	}
}
