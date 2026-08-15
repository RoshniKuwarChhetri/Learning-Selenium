package screenShot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	File source=driver.findElement(By.xpath("//img[@src=\"/Themes/DefaultClean/Content/images/logo.png\"]")).getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Screenshot\\element.jpg");
	
source.renameTo(destination);

}
}
