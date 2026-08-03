package operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActions {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000); 
        
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));

               search.sendKeys("apple Mpbile", Keys.SPACE);
        Thread.sleep(1000); 
        search.sendKeys(Keys.chord(Keys.CONTROL, "a")); 
        Thread.sleep(1000);
        search.sendKeys(Keys.chord(Keys.CONTROL, "x")); 
        Thread.sleep(1000);

               search.sendKeys("iphone "); 
               search.sendKeys(Keys.SPACE);
        	search.sendKeys(Keys.CONTROL, "v");
        
                Thread.sleep(3000); 
        //driver.quit();
    }
}
