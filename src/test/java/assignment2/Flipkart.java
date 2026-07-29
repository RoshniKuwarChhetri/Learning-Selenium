package assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	String code=driver.getPageSource();
	char arr1[]=code.toCharArray();
	char arr[]=new char[200];
	for(int i=0;i<arr.length;i++) {
		arr[i]=arr1[i];
		System.out.print(arr[i]);
	}
	Thread.sleep(3000);
	driver.quit();
	
}
}
