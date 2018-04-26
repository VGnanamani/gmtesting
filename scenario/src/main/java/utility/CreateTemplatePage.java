package utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateTemplatePage {

	
	static WebDriver driver;
	
	public CreateTemplatePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	//Reports window
	
		@FindBy(xpath="//a[@class='k-button k-grid-addReport grid-add-button']")
		WebElement btnCreate;
		
		//New template form
		
		@FindBy(xpath="//input[@id='reportName']")
		WebElement txtTemplateName;
		
		@FindBy(xpath="//span[.='Report Template']")
		WebElement optType;
		
		@FindBy(xpath="//*[@id='reportTypes-list']/span/input")
		WebElement optypevalue;
		
		@FindBy(xpath="//span[.='Choose style template...']")
		WebElement optStyleTemplate;
		
		@FindBy(xpath="//span[.='Choose style template...']")
		WebElement optStyleTemplatevalue;
		
		
		@FindBy(xpath="//button[.='Save']")
		WebElement btnsave;
		
		//***********************	
		public void create_template(String TemplateName, String Style, String StyleTemp) throws InterruptedException {
			
			
			Thread.sleep(5000);
			
			btnCreate.click();
			
			Thread.sleep(5000);
			
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss"); 
		    Date date = new Date();
		    String FinalDate = dateFormat.format(date);
		    Thread.sleep(10000);
		    
			txtTemplateName.sendKeys(TemplateName +FinalDate);	
			
			
			optType.click();
			optypevalue.sendKeys(Style);
			
			optStyleTemplate.click();
			optStyleTemplatevalue.sendKeys(StyleTemp);
			
			/*Select dropDownBox1 = new Select(optType);
			dropDownBox1.selectByVisibleText(Style);
			
			Select dropDownBox2 = new Select(optStyleTemplate);
			dropDownBox2.selectByVisibleText(StyleTemp);*/
			
			btnsave.click();
			
			
			
			
			
			
			
			
			
		}
		
		
}
