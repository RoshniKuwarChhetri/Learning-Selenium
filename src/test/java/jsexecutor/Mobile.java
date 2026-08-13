package jsexecutor;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobile {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        
        js.executeScript("window.location='https://www.amazon.in/';");

        Thread.sleep(3000);

       
        js.executeScript("document.getElementById('twotabsearchtextbox').value='mobile';" +
                "document.getElementById('nav-search-submit-button').click();");

        Thread.sleep(3000);

        String id= driver.getWindowHandle();
        js.executeScript("document.querySelector('div[data-component-type=\"s-search-result\"] h2[aria-label=\"Sponsored Ad - realme NARZO Power 5G (Titan Silver,8GB+256GB) 10001mAh Power. Stay Unstoppable. | 144Hz Curved+ AMOLED Display | Revolutionary Dual-Chip System | 50MP Sony OIS Camera\"]').click();");

        Set<String> ids=driver.getWindowHandles();
        
        for(String window: ids) {
        	if(!window.equals(id)) {
        		driver.switchTo().window(id);
        	}
        }
        Thread.sleep(3000);

        
       
        js.executeScript("document.querySelectorAll(\"input[id='submit.add-to-cart']\");");
    }

    }

