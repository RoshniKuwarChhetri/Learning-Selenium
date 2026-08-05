package operations;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebshopLink {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        String parentId = driver.getWindowHandle();
        WebElement follow = driver.findElement(By.xpath("//div[@class='column follow-us']"));
        List<WebElement> link = follow.findElements(By.tagName("a"));

        for (WebElement a : link) {
            String linkText = a.getText();
            
            if (linkText.equalsIgnoreCase("RSS")) {
                continue;
            }
            Thread.sleep(3000); 

            a.click();
            Thread.sleep(3000); 

            Set<String> allIds = driver.getWindowHandles();

            for (String id : allIds) {
                if (!id.equals(parentId)) {
                    driver.switchTo().window(id);
                    
                    String currentUrl = driver.getCurrentUrl();
                    System.out.println(currentUrl);

                    if (currentUrl.contains("google")) {
                        System.out.println("Opened Google page.");
                        Thread.sleep(3000); 
                        driver.findElement(By.xpath("//input[@id=\"_r_5_\"]")).sendKeys("roshni");
                    } else if (currentUrl.contains("twitter")) {
                        System.out.println("Opened Twitter page.");
                    } else if (currentUrl.contains("youtube")) {
                        System.out.println("Opened YouTube page.");
                    } else if (currentUrl.contains("facebook")) {
                        System.out.println("Opened Facebook page.");
                    }
                    
                }
            }
            
            driver.switchTo().window(parentId);
        }
        
       
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://youtube.com");
               

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://x.com");
        
       
    }
}
