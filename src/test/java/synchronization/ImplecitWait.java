package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplecitWait {
public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demoqa.com/text-box");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.findElement(By.id("userName")).sendKeys("Roshni");
   driver.findElement(By.id("userEmail")).sendKeys("roshni@gmail.com");
   driver.findElement(By.id("submit")).click();
   
   
}
}
