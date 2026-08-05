package operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class Task {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	 driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement ele=driver.findElement(By.id("oldSelectMenu"));
	    Select sel = new Select(ele);
	    sel.selectByVisibleText("Red");
	    sel.selectByVisibleText("Voilet");
	    sel.selectByVisibleText("Purple");
	    sel.deselectByValue("purple");
	   System.out.println(sel.getFirstSelectedOption().getText());
 

	}
}
