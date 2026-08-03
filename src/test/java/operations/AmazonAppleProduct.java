package operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAppleProduct {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys("apple");
    Thread.sleep(2000);

    search.sendKeys(Keys.ARROW_DOWN);
    search.sendKeys(Keys.ARROW_DOWN);

    search.sendKeys(Keys.ARROW_DOWN);
    search.sendKeys(Keys.ENTER);

}
}
