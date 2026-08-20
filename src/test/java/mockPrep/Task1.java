package mockPrep;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1 {
public static void main(String[] args) {
//ChromeOptions options = new ChromeOptions();

ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");

WebDriver driver = new ChromeDriver(options);	
driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/?utm_source=chatgpt.com");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	
	//driver.switchTo().alert().accept();
	
	if(driver.getTitle().contains("inventory")){
		System.out.println("product page displayed");
	}else {
		System.out.println("wrong page");
	}
	
    List<WebElement> pName= driver.findElements(By.className("inventory_item_name"));
	Iterator<WebElement> itr= pName.iterator();
	while(itr.hasNext()) {
		String name= itr.next().getText();
		System.out.println(name);
	}
    
	List<WebElement> pPrice = driver.findElements(By.className("inventory_item_price"));
	Iterator<WebElement> itr2= pPrice.iterator();
	while(itr2.hasNext()) {
	String price =itr2.next().getText();
	System.out.println(price);
	}
    
	driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]/../../..//button")).click();
	driver.findElement(By.className("shopping_cart_link")).click();
	if(driver.getPageSource().contains("Sauce Labs Backpack")) {
		System.out.println("Sauce Labs Backpack added to cart");
	}else {
		System.out.println("not found");
	}
	
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.id("first-name")).sendKeys("roshni");
	driver.findElement(By.id("last-name")).sendKeys("KC");
	driver.findElement(By.id("postal-code")).sendKeys("12212");
	driver.findElement(By.id("continue")).click();
	System.out.println(driver.findElement(By.className("inventory_item_name")).getText());
	System.out.println(driver.findElement(By.className("inventory_item_price")).getText());
	driver.findElement(By.id("finish")).click();
	if(driver.getPageSource().contains("complete")) {
		System.out.println("pass");
	}
	driver.quit();
	
}
}
