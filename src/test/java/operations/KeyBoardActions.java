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

               search.sendKeys("apple Mobile", Keys.SPACE);
        Thread.sleep(1000); 
        search.sendKeys(Keys.CONTROL, "a"); 
        Thread.sleep(1000);
        search.sendKeys(Keys.CONTROL, "x")
        ; 
        Thread.sleep(1000);

               search.sendKeys("iphone "); 
               search.sendKeys(Keys.SPACE);
        	search.sendKeys(Keys.CONTROL, "v");
        
                Thread.sleep(3000); 
                Thread.sleep(2000);

                search.sendKeys(Keys.ARROW_DOWN);
                Thread.sleep(1000);

                search.sendKeys(Keys.ARROW_DOWN);
                Thread.sleep(1000);

                search.sendKeys(Keys.ARROW_DOWN);
                Thread.sleep(1000);

                search.sendKeys(Keys.ENTER);

                
                driver.findElement(By.xpath("//span[text()=\"iPhone 17 Pro Max 256 GB: 17.42 cm (6.9″) Display with Promotion, A19 Pro Chip, Best Battery Life in Any iPhone Ever, Pro Fusion Camera System, Center Stage Front Camera; Silver\"]")).click();
                Thread.sleep(2000);

                driver.findElement(By.id("add-to-cart-button")).click();
                
        //driver.quit();
    }
}
