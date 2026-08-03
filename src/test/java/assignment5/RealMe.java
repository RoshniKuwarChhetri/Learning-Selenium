package assignment5;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealMe {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in");

        Thread.sleep(3000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
        driver.findElement(By.id("nav-search-submit-button")).click();

        Thread.sleep(3000);

        // Product names
        List<WebElement> allProduct = driver.findElements(
                By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//h2//span"));

        // Add to Cart buttons
        List<WebElement> allAddToCart = driver.findElements(
                By.xpath("//input[@name='submit.addToCart']"));

        Iterator<WebElement> it = allProduct.iterator();

        int pointer = 0;

        while (it.hasNext()) {

            String text = it.next().getDomProperty("innerText");

            if (text.contains("realme")) {

                System.out.println(text);

                try {

                    allAddToCart.get(pointer).click();

                } catch (Exception e) {

                    driver.findElement(By.xpath("(//button[@aria-label='Close'])[2]")).click();

                                }
            }

            pointer++;
        }

        Thread.sleep(5000);
       // driver.quit();
    }
}