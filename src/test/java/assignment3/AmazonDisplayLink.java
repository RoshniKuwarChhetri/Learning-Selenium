package assignment3;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDisplayLink {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
      
        Thread.sleep(3000);
        
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        int displayCount = 0;
        int notDisplayCount = 0;
           
        for (WebElement ele : links) {
        	  
            if (ele.isDisplayed()) {
            	                
            	displayCount++;
                System.out.println("visible link:" + displayCount);
                System.out.println( ele.getDomProperty("innerText"));
                System.out.println("-------------------------------------------------------------------------------------------");
            } else {
                notDisplayCount++;
            	                
                System.out.println("Invisible link:"+notDisplayCount);

                System.out.println( ele.getDomProperty("innerText"));
                System.out.println("---------------------------------------------------------------------------------------------");
    	          
            }
                     }
        System.out.println("---------------------------------------------------------------------------------------------");
          
                System.out.println("Total Links Found: " + links.size());
                
  	              System.out.println("Total Displayed Links: " + displayCount);
  	            System.out.println("Total Invisible Links: " + notDisplayCount);
       
        
      
        driver.quit();
       
    }
}
