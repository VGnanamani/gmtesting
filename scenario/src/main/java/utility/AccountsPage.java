package utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountsPage {
	
	
	
	
static WebDriver driver;
	
	public AccountsPage(WebDriver driver) {
		
		HomePage.driver = driver;
		
	}
	
	
	
	@FindBy(xpath="//*[@id='holdPanelBarFilter']/li/div/form/div[1]/div/div/div/div[1]/div/input")
	WebElement txtAccName;
	
	
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement btnApplyFilter;
	

	
	@FindBy(xpath="//li[.='acdc4ever (335)']")
	WebElement username;
	
	
	@FindBy(xpath="//*[@id='mainContent']/div/section/holdings-per-user-component/section/div[1]/div/div/div/fieldset/table/tbody/tr/td[1]/span")
	WebElement txtUsd;
	
	public void Applyfilter(String AccName) throws InterruptedException {
		
				
		Thread.sleep(5000);
		
				
		txtAccName.click();
		
		Thread.sleep(30000);
		
		txtAccName.sendKeys(AccName);
		
		Thread.sleep(5000);
	
		username.click();
		
		
		Thread.sleep(5000);
		
		
		System.out.print(AccName);
		btnApplyFilter.click();
		
		
		
	String USDvalue= txtUsd.getAttribute("value");
		
		System.out.println(USDvalue);
		
		
		
		
		
		
		
		
	}
	
//***************************************
	
	

}
		
		
		//txtAccName..sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
	