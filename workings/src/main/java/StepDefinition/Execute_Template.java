package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Execute_Template implements Utils {

	@Given("^click templates icon$")
	public void click_templates_icon() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(Utils.tabTemplates)).click(); 
	}

	@Then("^verify Market place tab$")
	public void verify_Market_place_tab() {
	   
		
		  WebDriverWait wait = new WebDriverWait(driver, 50);

          wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Utils.tabMarketplace))));
		
		
	}

	@Given("^Enter \"([^\"]*)\" in search text$")
	public void enter_in_search_text(String templatename) {
	   
		WebDriverWait wait = new WebDriverWait(driver, 50);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Utils.txtSearch))).sendKeys(templatename);
    	
		
	}

	@When("^click search icon$")
	public void click_search_icon() {
		
		driver.findElement(By.xpath(Utils.imgSearch)).click();
	    
	}

	
	@Given("^mosehover on dotmenu$")
	public void mosehover_on_dotmenu() throws InterruptedException {
	Thread.sleep(1000); 
	
	
		WebElement element = driver.findElement(By.xpath(Utils.imglefticons));
		 
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
		
        //driver.findElement(By.xpath(Utils.imglefticons)).click();
  	  driver.findElement(By.xpath(Utils.imgExecute)).click();

	}
	
	@Given("^Click Execute button$")
	public void click_Execute_button() throws InterruptedException {
	//  Thread.sleep(1000); 
	  
	}

	@Given("^verify popup load$")
	public void verify_popup_load() {
		
		
	   
	}

	
	
	
	
}
