package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.in/");
      driver.manage().window().maximize();
      Thread.sleep(2000);
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
      Thread.sleep(2000);
      driver.findElement(By.id("nav-search-submit-button")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//span[@id='WVCRIAFWG']/../../../../../..//button[@class='a-button-text']")).click();
      Thread.sleep(5000);
      driver.close();
}
}
//driver.findElement(By.id("_R_1hmkqsqppb6amH1_")).sendKeys("123");