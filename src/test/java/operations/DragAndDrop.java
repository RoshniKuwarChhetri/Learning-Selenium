package operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/droppable");
	WebElement ele1=driver.findElement(By.id("draggable"));
	WebElement ele2=driver.findElement(By.id("droppable"));
	
	Actions action = new Actions(driver);
	
	action.dragAndDrop(ele1, ele2).perform();
	
}
}
