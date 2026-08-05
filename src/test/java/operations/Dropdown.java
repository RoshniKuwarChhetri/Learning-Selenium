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
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebElement search= driver.findElement(By.id("small-searchterms"));
	search.sendKeys("computer");
	search.submit();
	
	WebElement sel1= driver.findElement(By.id("products-orderby"));
	Select select1=new Select(sel1);
	select1.selectByVisibleText("Name: A to Z");
	select1.selectByVisibleText("Name: Z to A");

	select1.deselectByVisibleText("Name: A to Z");
	//select1.getFirstSelectedOption();
	
	WebElement sel2=driver.findElement(By.id("products-pagesize"));
	Select select2 =new Select(sel2);
	select2.selectByVisibleText("4");
	//select2.deselectByVisibleText("4");
	
	
	
	
	
	

	
	}
}
