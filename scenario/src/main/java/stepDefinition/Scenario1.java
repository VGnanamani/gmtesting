package stepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BrowserDrivers;
import utility.CreateTemplatePage;
import utility.LoginPage;
import utility.MenuoptionsPage;

public class Scenario1 {

	

	static WebDriver driver;
	
	
	
	
	
	@Given("^launch browser \"([^\"]*)\" and \"([^\"]*)\"$")
	public void launch_browser_and(String browserName, String URL) {
	
		 driver=BrowserDrivers.LaunchBrowser(browserName, URL);
				    
	}

	@When("^enter \"([^\"]*)\" and \"([^\"]*)\" and click Login button$")
	public void enter_and(String Username, String Password) throws InterruptedException {
		
		Thread.sleep(10000);
				
		LoginPage LP= PageFactory.initElements(driver, LoginPage.class);
				
		LP.logintoApp(Username, Password);
	    
	}

	
	@Then("^click on the Reports from left navigation bar and Under Reports menu, go to sub-menu Reports Templates Design$")
	public void click_on_the_Reports_from_left_navigation_bar_and_Under_Reports_menu_go_to_sub_menu_Reports_Templates_Design() throws InterruptedException {
	   
		Thread.sleep(10000);
	
		MenuoptionsPage MP= PageFactory.initElements(driver, MenuoptionsPage.class);
		MP.Navigate_reports();
		MP.Navigate_to_submenu();
	}

	
	
	@Then("^Click create button and On the pop-up, enter any \"([^\"]*)\", choose \"([^\"]*)\" as \"([^\"]*)\" and click on Save$")
	public void click_create_button_and_On_the_pop_up_enter_any_choose_template_as_and_click_on_Save(String TemplateName, String Style, String StyleTemp) throws InterruptedException {
		
				
	CreateTemplatePage CT=PageFactory.initElements(driver, CreateTemplatePage.class);
	CT.create_template(TemplateName, Style, StyleTemp);			
	}

	

	@Then("^In the table, in the Name column, enter the unique report template name that you had previously given above step$")
	public void in_the_table_in_the_Name_column_enter_the_unique_report_template_name_that_you_had_previously_given_above_step() {
	    
	}

	@Then("^Validate that the template created by you is present in the table\\.$")
	public void validate_that_the_template_created_by_you_is_present_in_the_table() {
	    
	}

	@Then("^Logout from the application$")
	public void logout_from_the_application() {
	    
	}

	
}
