package assignment5;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealMe {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.in");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Realme phones");
        search.submit();
        Thread.sleep(3000);

        List<WebElement> realme = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));
        Iterator<WebElement> itr = realme.iterator();

        while (itr.hasNext()) {
            WebElement currPh = itr.next();
            String text = currPh.getText().toLowerCase();

            if (text.contains("realme")) {
                System.out.println("Adding: " + currPh.getText());
                WebElement add = currPh.findElement(By.xpath("./ancestor::div[contains(@class, 's-result-item')]//button[@name='submit.addToCart']"));
                add.click();
                Thread.sleep(4000);
            }
        }

        driver.quit();
    }
}
`