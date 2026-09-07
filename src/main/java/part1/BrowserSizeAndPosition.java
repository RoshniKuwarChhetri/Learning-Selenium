package part1;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSizeAndPosition {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().setSize(new Dimension(800,600));
	System.out.println(driver.manage().window().getSize());
	driver.manage().window().setPosition(new Point(100,100));
	System.out.println(driver.manage().window().getPosition());
}
}

