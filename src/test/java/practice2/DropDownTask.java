package practice2;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.qafeast.com/demo?utm_source=chatgpt.com");
	driver.findElement(By.xpath("//label[text()=\"Dropdown\"]")).click();
	Select select = new Select(driver.findElement(By.name("countryname")));
	select.selectByIndex(1);
	if(select.getFirstSelectedOption().getText().equals("ALGERIA")) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}
	
	List<WebElement> opti =select.getOptions();
	ListIterator<WebElement> itr= opti.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next().getText()); 
	}
		
	driver.get("https://the-internet.herokuapp.com/hovers");
	Actions act= new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"))).perform();
	driver.findElement(By.xpath("//a[@href=\"/users/1\"]")).click();
	
	
}
}
