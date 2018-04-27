package utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;


public class HomePage {

	static WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		HomePage.driver = driver;
		
	}

	
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
    Date date = new Date();
    String FinalDate = dateFormat.format(date);
    
  
    		
	//home page elements

	@FindBy(xpath="/descendant::input[@aria-label='Name' and @type='text'][1]")
	WebElement txtName;
	
	
	@FindBy(xpath="/descendant::input[@aria-label='Owner' and @type='text'][1]")
	WebElement txtowner;
	
	
	@FindBy(xpath="//td[.='\" + TemplateName + FinalDate\"']")
	WebElement objcreatetemplate;
	
	
	@FindBy(xpath="/descendant::span[@aria-label='select' and @class='k-select'][2]")
	WebElement drpStyle;
	
	
	
	//Edit template 
	
	@FindBy(xpath="//span[@class='k-icon k-i-edit']")
	WebElement btnEdit;
	

	@FindBy(xpath="//span[.='In Progress']")
	WebElement drpstatus;
	
	@FindBy(xpath="//button[.='Save']")
	WebElement btnsave;
	
	
	//Copy template
	
	@FindBy(xpath="//span[@class='k-icon k-i-copy']")
	WebElement btnCopy;
	

	@FindBy(xpath="//input[@id='reportName']")
	WebElement txtTemplateName;
	
	
	@FindBy(xpath="//input[@id='reportDescription']")
	WebElement txtDescription;
	
	//logout
	
	@FindBy(xpath="//i[@class='fa fa-user fa-fw']")
	WebElement ImgUserIcon;
	
	@FindBy(xpath="//a[@class='navbar-link' and normalize-space(.)='Logout']")
	WebElement btnLogout;
	

	//***********************	
	public void Searchtemplate(String TemplateName, String Username) throws InterruptedException {
		
		
		String s= TemplateName +FinalDate;
		
		System.out.println(s);

	    Thread.sleep(10000);
	    
	    txtName.clear();
	    
		txtName.sendKeys(s);
		
		txtowner.clear();
		
		txtowner.sendKeys(Username);
		
		Actions action = new Actions(driver);

		action.moveToElement(txtowner).click().perform();
		
		Assert.assertTrue(driver.getPageSource().contains(s));
		
	}
		
	
	
	//***********************	
	
	public void Logout() throws InterruptedException {
		
		Thread.sleep(10000);
		ImgUserIcon.click();
		
		
		btnLogout.click();
		
		}
	//***********************
	
	public void edit_template() throws InterruptedException {
		
		Thread.sleep(10000);
		
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
			
		js.executeScript("arguments[0].click();", btnEdit);
		
		
		Thread.sleep(5000);
		
		drpstatus.click();
		
		Actions drpstatus = new Actions(driver);

		
		drpstatus.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
		
		drpstatus.sendKeys(Keys.ENTER).perform();
		
		btnsave.click();
	}
	
	//***********************
	
	public void validate_edited_template(String TemplateName, String Username) throws InterruptedException {
		
        String s= TemplateName +FinalDate;
		
		System.out.println(s);

	    Thread.sleep(10000);
	    
		txtName.sendKeys(s);
		
		txtowner.sendKeys(Username);
		
		Actions action = new Actions(driver);

		action.moveToElement(txtowner).click().perform();
		
        Actions drpStyle = new Actions(driver);

		drpStyle.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
		
		drpStyle.sendKeys(Keys.ENTER).perform();
						
		Assert.assertTrue(driver.getPageSource().contains(s));
		
	}
	
	//***********************
	
	public void copy_Template(String TemplateName) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", btnCopy);
		
		
		Thread.sleep(5000);
		
		txtTemplateName.clear();
		
		//Thread.sleep(5000);
		
		txtTemplateName.sendKeys(TemplateName +FinalDate);	
		
		 Thread.sleep(10000);

		txtDescription.sendKeys("test automation");
	
	
	}
	
	
	public void Save() {
		
		btnsave.click();
		
	}
	
}
