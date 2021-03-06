package utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuoptionsPage {

WebDriver driver;
	
	public MenuoptionsPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
	@FindBy(xpath="//span[.=' REPORTS']")
	WebElement optReports;
	
	
	@FindBy(xpath="//span[.=' Reports Templates Design']")
	WebElement optReports_Templates_Design;
	
	
	@FindBy(xpath="//span[.=' USER ACCOUNTS']")
	WebElement btnUserAccounts;
	
	@FindBy(xpath="//span[.=' Account Holdings']")
	WebElement btnAccountHolding;
	
	
	//***********************
	public void Navigate_reports() throws InterruptedException {
		Thread.sleep(5000);
		optReports.click();
			
	}
	//***********************
	
	public void Navigate_to_submenu() {
		optReports_Templates_Design.click();
		
	}
	
	//**********************
    public void navigate_UserAccount() {
    	btnUserAccounts.click();
    	
		
	}
    
    public void navigate_AccountHolding() {
    	
    	btnAccountHolding.click();
    	
    }
	
	
}
