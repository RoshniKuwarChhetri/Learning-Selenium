package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeBrowser {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://demowebshop.tricentis.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("FirstName")).sendKeys("roshni");
	driver.findElement(By.id("LastName")).sendKeys("K.C.");
	driver.findElement(By.id("Email")).sendKeys("roshni122121221212212@gmail.com");
	WebElement pw= driver.findElement(By.id("Password"));
	pw.sendKeys("123456789");
	pw.clear();
	pw.sendKeys("123456789");
	
	driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
	WebElement gender= driver.findElement(By.id("gender-female"));
	
			gender.click();
	System.out.println(gender.isSelected());
	
	WebElement reg=driver.findElement(By.id("register-button"));
	System.out.println(reg.isDisplayed());
	System.out.println(reg.isEnabled());
	System.out.println(reg.getText());
	System.out.println(reg.getTagName());
	System.out.println(reg.getAttribute("value"));
	System.out.println(reg.getCssValue("transition"));
	System.out.println(reg.getSize());
	System.out.println(reg.getLocation());
	System.out.println(reg.getRect());
	System.out.println(reg.getDomAttribute("class"));
	System.out.println(reg.getDomProperty("class"));
			reg.click();
	
	//WebElement error=driver.findElement(By.className("validation-summary-errors"));
	if(driver.getPageSource().equals("Register")) {
		System.out.println("Registration successful");
	}else {
		System.out.println("Registration Failed") 	;
	}
	WebElement msg = driver.findElement(By.className("result"));
	System.out.println(msg.getText());
	System.out.println(msg.isDisplayed());
	System.out.println(msg.isEnabled());
	System.out.println(msg.isSelected());
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(3000);
	driver.quit();
}
}
