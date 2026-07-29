package assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v126.schema.model.Domain;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
     System.out.println(driver.manage().window().getSize());
     Thread.sleep(2000);
     driver.quit();
}
}
