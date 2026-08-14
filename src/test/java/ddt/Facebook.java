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

public class Facebook {
	 static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {

       
        FileInputStream file = new FileInputStream(
        		"src/test/resources/FacebookData.properties");

       
        Properties prop = new Properties();

        
        prop.load(file);

       
        String browser = prop.getProperty("browser");
        String url = prop.getProperty("url");
        String userName = prop.getProperty("username");
        String password = prop.getProperty("password");

       

       
       
        switch (browser) {

        case "Chrome":
            driver = new ChromeDriver();
            break;

        case "Firefox":
            driver = new FirefoxDriver();
            break;

        case "Edge":
            driver = new EdgeDriver();
            break;

        default:
            System.out.println("Enter a valid browser name");
            break;
        }

        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.get(url);

       
        driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys(userName);

       
        driver.findElement(By.id("_R_1hmkqsqppb6amH1_")).sendKeys(password);

        
        driver.findElement(By.xpath("//span[text()=\"Log in\"]")).click();

        Thread.sleep(3000);

        
        String errorMessage = driver.findElement(
                By.xpath("//a[@href=\"https://facebook.com/login/identify/\"]"))
                .getText();

        
                FileOutputStream fileOutput = new FileOutputStream(
                "src/test/resources/FacebookData.properties");

               prop.setProperty("errorMessage", errorMessage);

              prop.store(fileOutput, "Updated Facebook Login Error");

        fileOutput.close();
        file.close();

        
    }
}