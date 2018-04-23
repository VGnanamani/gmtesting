package StepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Add_Cloud_Account implements Utils{
	
	
		
	
	
	@Given("^verify Account name field is availability$")
	public void verify_Account_name_field_is_availability() {
		WebElement AC= driver.findElement(By.xpath(Utils.txtAccName));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", AC);
		
		
        //   WebDriverWait wait = new WebDriverWait(driver, 50);

          // wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Utils.txtAccName)));
			
			
	    
	}

	@Given("^verify Description field is availability$")
	public void verify_Description_field_is_availability() {
		
		driver.findElement(By.xpath(Utils.txtDescp)).isDisplayed(); //description field

	   
	}

	@Given("^verify Select options field is availability$")
	public void verify_Select_options_field_is_availability() {
	    
		driver.findElement(By.xpath(Utils.btnCustom)).isDisplayed();//custom option button

		
	}

	@Given("^verify Environment dropdown field is availability$")
	public void verify_Environment_dropdown_field_is_availability() {
		
		driver.findElement(By.xpath(Utils.drpEnvmt)).isDisplayed();  //Environment field
	
	    
	}

	@Given("^verify Scope dropdown field is availability$")
	public void verify_Scope_dropdown_field_is_availability() {
		
		driver.findElement(By.xpath(Utils.drpScope)).isDisplayed(); 
 
	}

	@Given("^verify TenantID field is availability$")
	public void verify_TenantID_field_is_availability() {
		
		driver.findElement(By.xpath(Utils.txtTenant_ID)).isDisplayed();  
	}

	@Given("^verify Account ID field is availability$")
	public void verify_Account_ID_field_is_availability() {
		driver.findElement(By.xpath(Utils.txtApp_ID)).isDisplayed();
	}

	@Given("^verify Application Secret field is availability$")
	public void verify_Application_Secret_field_is_availability() {
		driver.findElement(By.xpath(Utils.txtApp_Sec)).isDisplayed();
	}

	@Given("^verify Application secret id field is availability$")
	public void verify_Application_secret_id_field_is_availability() {
		driver.findElement(By.xpath(Utils.btnGenerate)).isDisplayed();
	}

	@Given("^enter Account name$")
	public void enter_Account_name() {
		
			    
		driver.findElement(By.xpath(Utils.txtAccName)).sendKeys("UserAccountQA3"+Utils.FinalDate);
		
	}

	@Given("^enter description$")
	public void enter_description() {
		driver.findElement(By.xpath(Utils.txtDescp)).sendKeys("Test Automation script");
	}

	@Given("^Select Custom option$")
	public void select_Custom_option() {
		
		driver.findElement(By.xpath(Utils.btnCustom)).click();
	}

	@Given("^select Staging in env dropdown$")
	public void select_Staging_in_env_dropdown() {
		
         Select dropEnvironment= new Select(driver.findElement(By.xpath(Utils.drpEnvmt)));
		
		dropEnvironment.selectByVisibleText("Staging");
	   
	}

	@Given("^Select Tenant in scope$")
	public void select_Tenant_in_scope() {
		
        Select dropscope= new Select(driver.findElement(By.xpath(Utils.drpScope)));
		
		dropscope.selectByVisibleText("Tenant");
		
		
	}

	@Given("^Enter Tenantid \"([^\"]*)\"$")
	public void enter_Tenant_id(String tenantid) {
		driver.findElement(By.xpath(Utils.txtTenant_ID)).sendKeys(tenantid);
	}

	@Given("^Enter applicationid \"([^\"]*)\"$")
	public void enter_application_id(String AppID) {
		driver.findElement(By.xpath(Utils.txtApp_ID)).sendKeys(AppID);
	}

	@Given("^Enter secretid \"([^\"]*)\"$")
	public void enter_secret_id(String SecretID) {
		driver.findElement(By.xpath(Utils.txtApp_Sec)).sendKeys(SecretID);
	}

	@Then("^click generate button$")
	public void click_generate_button() {
		driver.findElement(By.xpath(Utils.btnGenerate)).click();
	}

	@Then("^Select SubscriptionID \"([^\"]*)\"$")
	public void sectret(String SubsID) {
        Select dropscope= new Select(driver.findElement(By.xpath(Utils.drpSubscriptionID)));
		
		dropscope.selectByVisibleText(SubsID);
	}
	@Then("^Click Next button$")
	public void click_Next_button() throws InterruptedException {
		 
		Thread.sleep(30000);
		
		
		WebElement Nxt= driver.findElement(By.xpath(Utils.btnNext_ADD));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", Nxt);
	}

	@Given("^Click Next button for activation$")
	public void click_Next_button_for_activation() throws InterruptedException {
		
		
		Thread.sleep(30000);
		WebElement Nxt= driver.findElement(By.xpath(Utils.btnNext_ADD));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", Nxt);
	}

	@Given("^Click Next button for configuration$")
	public void click_Next_button_for_configuration() throws InterruptedException {
		
		Thread.sleep(30000);
		
		WebElement Nxt= driver.findElement(By.xpath(Utils.btnNext_ADD));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", Nxt);
		
		//driver.findElement(By.xpath(Utils.btnNext_ADD)).click();
	}
//
	
		
		

@Given("^Select roles$")
public void select_roles() {
   
	driver.findElement(By.xpath(Utils.approver_chkbox)).click();
	
	driver.findElement(By.xpath(Utils.consumer_chkbox)).click();
	
	
}

@Then("^Click Finish button$")
public void click_Finish_button() {
    
	driver.findElement(By.xpath(Utils.btnFinish)).click();

}
		
	
}
		
		

