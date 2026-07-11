package operations;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	WebElement ele1= driver.findElement(By.id("oldSelectMenu"));
	Select select=new Select(ele1);
	
	//select by index
	//select.selectByIndex(2);
	//select by value
	//select.selectByValue("5");
	
	//select by visible text
	select.selectByVisibleText("Magenta");
	java.util.List<WebElement> list=select.getOptions();
	for(WebElement elements:list) {
		System.out.println(elements.getText());
	}
	driver.quit();
	
	}
}
