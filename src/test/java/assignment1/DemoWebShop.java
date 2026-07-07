package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.xpath("//label[@for=\"gender-female\"]")).click();
	WebElement name=driver.findElement(By.id("FirstName"));
	enterData(name,"Roshni");
	WebElement lastName=driver.findElement(By.id("LastName"));
	enterData(lastName,"Kuwar Chhetri");
	WebElement email=driver.findElement(By.id("Email"));
	enterData(email,"rkc2@gmail.com");
	WebElement password=driver.findElement(By.id("Password"));
	enterData(password,"12345678");
	WebElement conPassword=driver.findElement(By.id("ConfirmPassword"));
	enterData(conPassword,"12345678");
	driver.findElement(By.id("register-button")).click();
	if(driver.findElement(By.className("result")).equals("Your registration completed")){
		System.out.println("Register successfull");
	}else System.out.println("Registration failure");
	driver.close();
	
}

public static void enterData(WebElement ele,String a) throws InterruptedException {
	ele.click();
	ele.sendKeys(a);
	Thread.sleep(1000);
}
}
