package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Property {
public static void main(String[] args) throws IOException {
	
	FileInputStream file = new FileInputStream("src/test/resources/Practice.properties");
	Properties prop = new Properties();
	prop.load(file);
	
	String url =prop.getProperty("url");
	String browser= prop.getProperty("browser");
	String uname=prop.getProperty("email");
	String pword=prop.getProperty("password");
	 
	WebDriver driver=null;
	switch(browser) {
	case "Chrome": driver= new ChromeDriver();
	break;
	
	case "Edge" : driver=new EdgeDriver();
	break;
	
	case "Firefox": driver= new FirefoxDriver();
	break;
	
	default : System.out.println("no such driver");
	}
	
	driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.id("Email")).sendKeys(uname);
	driver.findElement(By.id("Password")).sendKeys(pword);
	
	String error=driver.findElement(By.xpath("//span[@for=\"Email\"]")).getText();
	
	FileOutputStream file1= new FileOutputStream("src/test/resources/Practice.properties");
	
	prop.setProperty("error", error);
	prop.store(file1, error);
	file1.close();
}
}
