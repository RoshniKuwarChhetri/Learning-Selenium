package action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.amazon.in/");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      
	      Actions actions = new Actions(driver);
	      actions.moveByOffset(1264, 30).moveByOffset(0,428).click().perform();
	}
}
