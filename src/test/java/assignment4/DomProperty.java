package assignment4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomProperty {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	List<WebElement> allAddedDiv= driver.findElements(By.cssSelector(".inputs"));
	//6 elements
	
	int i=0;
	//capture all the divs which are use to store the components of the register page
	
	for(WebElement divElement : allAddedDiv) {
		i++;
		System.out.println("div "+ i);
		//capture the label element using div element's scope
		WebElement labelElement= divElement.findElement(By.tagName("label"));
		
		//capture html code inside div by using dom property innerHTML
		System.out.println(divElement.getDomProperty("innerHTML"));
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		
		
	}
	driver.quit();
	
}
}
