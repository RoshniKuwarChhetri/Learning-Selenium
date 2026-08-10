package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonNewTab {
public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    
    Actions actions = new Actions(driver);
    actions.keyDown(Keys.CONTROL).moveToElement(driver.findElement(By.linkText("Sell on Amazon"))).click().perform();

}
}
