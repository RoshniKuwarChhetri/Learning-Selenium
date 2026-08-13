package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//label[@for=\"gender-female\"]")
	private WebElement gender;
	@FindBy(id="FirstName")
	private WebElement name;
	@FindBy(id="LastName")
	private WebElement lastName;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(id="Password")
	private WebElement password;
	@FindBy(id="ConfirmPassword")
private WebElement confirmPassword;
	
	@FindBy(id="register-button")
	private WebDriver reg;
	
public WebElement getGender() {
	return gender;
}
public WebElement getName() {
	return name;
}
public WebElement getLastName() {
	return lastName;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getConfirmPassword() {
	return confirmPassword;
}
public WebDriver getReg() {
	return reg;
}


	

}
