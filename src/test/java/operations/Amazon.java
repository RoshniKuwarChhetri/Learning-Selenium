package operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys("mobile");
    Thread.sleep(2000);

    search.clear();
    Thread.sleep(2000);
    search.sendKeys(Keys.SHIFT+"Realme",Keys.ENTER);

}
}
