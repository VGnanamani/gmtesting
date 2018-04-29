package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement txtUsername;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement btnLogin;
	
	
	
	
	public void logintoApp(String Username, String Password) {
		
		txtUsername.sendKeys(Username);
		
		txtPassword.sendKeys(Password);
		
		btnLogin.submit();
				
		
	}
	
}
