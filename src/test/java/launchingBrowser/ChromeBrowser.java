package launchingBrowser;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.Thread;

public class ChromeBrowser {

    public static void main(String[] args) {

        

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());

         if(driver.getTitle().contains("Amazon")) {
        	 System.out.println("valid tab");
         }else {
        	 System.out.println("invalid");
         }
         
         String currUrl=driver.getCurrentUrl();
         System.out.println(currUrl);
         if(currUrl.contains("amazon")) {
        	 System.out.println("pass");
         }else {
        	 System.out.println("fail");
         }
         String sCode=driver.getPageSource();
         
         if(sCode.contains("Facebook")) {
        	 System.out.println("displayed");
         }else {
        	 System.out.println("not displayed");
         }
         driver.get("https://www.youtube.com");
         driver.get("https://www.myntra.com");
         
         driver.navigate().back();
         try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
         driver.navigate().forward();
         driver.navigate().refresh();
         driver.manage().window().minimize();
         
         int height=driver.manage().window().getSize().getHeight();
         System.out.println(height);
         driver.manage().window().maximize();
         System.out.println(driver.manage().window().getSize().height);
         driver.manage().window().setSize(new Dimension(400,200));
         System.out.println(driver.manage().window().getPosition().getX());
         System.out.println(driver.manage().window().getPosition().getY());
       
         driver.manage().window().setPosition(new Point(700,400));
      
         String sessionId=driver.getWindowHandle();
         System.out.println(sessionId);
       driver.quit();
    }
}