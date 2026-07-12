package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calander {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/date-picker");
	driver.findElement(By.id("datePickerMonthYearInput")).click();
	
	WebElement month= driver.findElement(By.className("react-datepicker__month-select"));
	Select select =new Select(month);
	select.selectByVisibleText("December");
	
	WebElement year= driver.findElement(By.className("react-datepicker__year-select"));
	Select select2= new Select(year);
	select2.selectByValue("2027");
	driver.findElement(By.xpath("//div[@role='table']//div[text()='22']")).click();
	String date=driver.findElement(By.id("datePickerMonthYearInput")).getAttribute("value");
	System.out.println(date);
	driver.close();
}
}
