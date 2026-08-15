package screenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chatgpt.com/c/6a7ea4c8-dc08-83e8-b148-c21a5a2dc317");
	TakesScreenshot ss= (TakesScreenshot)driver;
    File source	=ss.getScreenshotAs(OutputType.FILE);
	File destination= new File("C:\\Screenshot\\ss.png");
	source.renameTo(destination);
}
}
