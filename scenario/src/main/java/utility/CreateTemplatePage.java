package utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class CreateTemplatePage {

	
	static WebDriver driver;
	
	public CreateTemplatePage(WebDriver driver) {
		
		CreateTemplatePage.driver=driver;
		
	}
	
	  
	//Reports window
	
		@FindBy(xpath="//a[@class='k-button k-grid-addReport grid-add-button']")
		WebElement btnCreate;
		
		//New template form
		
		@FindBy(xpath="//input[@id='reportName']")
		WebElement txtTemplateName;
		
		@FindBy(xpath="//span[.='Report Template']")
		WebElement optType;
		
			
		@FindBy(xpath="//span[.='Choose style template...']")
		WebElement optStyleTemplate;
		
		
		@FindBy(xpath="//button[.='Save']")
		WebElement btnsave;
		
		@FindBy(xpath="//input[@id='reportDescription']")
		WebElement txtDescription;
		
		//***********************	
		public void create_template(String TemplateName) throws InterruptedException {
			
			
			Thread.sleep(5000);
			
			btnCreate.click();
			
			Thread.sleep(5000);
			
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		    Date date = new Date();
		    String FinalDate = dateFormat.format(date);
		    Thread.sleep(10000);
		    
			txtTemplateName.sendKeys(TemplateName +FinalDate);	
			
			
			Thread.sleep(10000);

			txtDescription.sendKeys("test automation");
			optType.click();
			
			
			Actions optType = new Actions(driver);
			 
			optType.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).perform();
			optType.sendKeys(Keys.ENTER).perform();
			
			
		    Thread.sleep(10000);

						
			
			optStyleTemplate.click();
			
			
			Actions optStyleTemplate = new Actions(driver);
			
			
			optStyleTemplate.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
			optStyleTemplate.sendKeys(Keys.ENTER).perform();
			
			
		    Thread.sleep(10000);

			
			btnsave.click();
			
			
			//Template creation done		
			
			
			
		}
		
		
}
