/**
 * 
 */
package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefinition.Utils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Gnanamani
 *
 */
public class Scenario_Login implements Utils {

	
	
	
	@Given("^launch browser$")
	public void launch_browser() {
		//System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	    //driver=new FirefoxDriver();
	
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
      
	driver.manage().window().maximize();
	   
	}

	@Given("^Enter URL and view login page$")
	public void enter_URL_and_view_login_page() {
		
		driver.get("http://qa.corestack.io/site/login");
				
	   
	}
	@When("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String Uname, String Password) {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name(Utils.UserID)).sendKeys(Uname);
		
		
		
		driver.findElement(By.xpath(Utils.btnNext)).click();
		
		
		driver.findElement(By.id("checkPwd")).sendKeys(Password);
		
	}

	@When("^click login button$")
	public void click_login_button() {
	    
		driver.findElement(By.xpath("//input[@class='btn btn-default btn-block']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws InterruptedException {
	   
		
		driver.findElement(By.xpath("//i[@class='icon-settings fn18 m-r-none']")).isDisplayed();
		
		
		
	   
	}

	


}
