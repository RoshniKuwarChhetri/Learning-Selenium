package assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zepto {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zepto.com/");
		
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.xpath("//input[@placeholder=\"Search for over 5000 products\"]"));
		Thread.sleep(2000);
		search.sendKeys("sunfloweroil",Keys.ENTER);
		
		driver.findElement(By.xpath("//img[@src=\"https://cdn.zeptonow.com/production/cms/category/dc4a299d-521f-4a64-8205-c5ba8e1d13e3.png?tr=f-webp\"]")).click();
		}
}
