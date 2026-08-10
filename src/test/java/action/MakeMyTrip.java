package action;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {
	
	public static void main(String[] args) {
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Actions action =new Actions(driver); 
		action.moveByOffset(80, 220).click().perform();
	}
}
