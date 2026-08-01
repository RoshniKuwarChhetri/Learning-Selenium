package iterator;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        List<WebElement> links = driver.findElements(By.tagName("li"));

        Iterator<WebElement> itr = links.iterator();

        while (itr.hasNext()) { 
            WebElement element = itr.next();
            //E AKA generic return type is the  return type of next()  
            System.out.println(element.getText());
        }

        driver.quit();
    }
}