package practice2;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipeElements {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Books")).click();
	
	List<WebElement> pro =driver.findElements(By.className("rating"));
	int count=0;
	for( WebElement p : pro) {
		count++;
	}
	System.out.println(count);
	
	List<WebElement> name = driver.findElements(By.xpath("//h2/a"));
	
	for(WebElement n : name) {
		System.out.println(n.getText());
	}
	List<WebElement> price= driver.findElements(By.xpath("//h2/a/../..//span[@class='price actual-price']"));
	for(WebElement pr: price) {
		System.out.println(pr.getText());
	}
	List<WebElement> link = driver.findElements(By.tagName("a"));
	for(WebElement li:link ) {
		System.out.println(li.getText());
	}
	
}
}
