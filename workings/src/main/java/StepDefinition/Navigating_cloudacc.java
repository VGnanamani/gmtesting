package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Navigating_cloudacc implements Utils{

	@Given("^In landing page click on the settings icon$")
	public void in_landing_page_click_on_the_settings_icon() {
		try {
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(10000);
			
			WebElement s= driver.findElement(By.xpath("//i[@class='icon-settings fn18 m-r-none']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", s);
		
			
	}
		catch (Exception e) {
            e.printStackTrace();
        }
		
	}

	@Given("^select cloud accounts option$")
	public void select_cloud_accounts_option() {
	    
		driver.findElement(By.xpath(".//*[@id='app-container']/div[4]/div/div[1]/nav/ul/li[3]/ul/li[1]/a")).click();
		
		
		
	}

	

	@When("^select Azure Rm option$")
	public void select_Azure_Rm_option() {
	   
		try {
			Thread.sleep(10000);
		
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[@class='list-group-item-heading ng-binding' and .='AzureRM']")));
			
		driver.findElement(By.xpath("//h4[@class='list-group-item-heading ng-binding' and .='AzureRM']")).click();  
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@When("^select Add cloud account$")
	public void select_Add_cloud_account() {
	   
		WebDriverWait wait = new WebDriverWait(driver, 70);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Utils.btnAddAcc)));
		
		
		WebElement el= driver.findElement(By.xpath(Utils.btnAddAcc));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", el);
	}

	@Then("^Authentication option should appear$")
	public void authentication_option_should_appear() {
	   
	    //navigated to Authentication tab and validating all the fields
		
			
		
	}
	
}
