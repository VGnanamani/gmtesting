package stepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BrowserDrivers;
import utility.CreateTemplatePage;
import utility.HomePage;
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

	
	
	@Then("^Click create button and On the pop-up, enter any \"([^\"]*)\", choose Style Template as BaseTemplateDL and click on Save$")
	public void click_create_button_and_On_the_pop_up_enter_any_choose_Style_Template_as_BaseTemplateDL_and_click_on_Save(String TemplateName)  throws InterruptedException {
		
				
	CreateTemplatePage CT=PageFactory.initElements(driver, CreateTemplatePage.class);
	CT.create_template(TemplateName);			
	}

	
	
	@Then("^In the table, in the Name column, enter the unique report template name \"([^\"]*)\" and Owner name \"([^\"]*)\" and Validate that the template$")
	
	public void in_the_table_in_the_Name_column_enter_the_unique_report_template_name_and_Owner_name_and_Validate_that_the_template(String TemplateName,String Username) throws InterruptedException {

	
		HomePage HP= PageFactory.initElements(driver, HomePage.class);
		
		HP.Searchtemplate(TemplateName, Username); 
		
	}
	
	@Then("^Logout from the application$")
	public void logout_from_the_application() throws InterruptedException {
	    
		HomePage HP= PageFactory.initElements(driver, HomePage.class);
		
		HP.Logout();
	}

	@Then("^In the table, in the Name column, enter the unique report template name \"([^\"]*)\" and Owner name \"([^\"]*)\"$")
	public void in_the_table_in_the_Name_column_enter_the_unique_report_template_name_and_Owner_name(String TemplateName,String Username) throws InterruptedException {
       
		HomePage HP= PageFactory.initElements(driver, HomePage.class);
		
		HP.Searchtemplate(TemplateName, Username); 
	}

	
	@Then("^Click on the Edit icon of template and On the pop-up, edit the status to Ready to Assign and click on save\\.$")
	public void click_on_the_Edit_icon_of_template_and_On_the_pop_up_edit_the_status_to_Ready_to_Assign_and_click_on_save() throws InterruptedException {
	    
		   
		HomePage HP= PageFactory.initElements(driver, HomePage.class);
        HP.edit_template();
		
		
	}

	

	@Then("^Validate that the Status for your template in the table with \"([^\"]*)\" and Owner name \"([^\"]*)\"  and with Ready to Assign$")
	public void validate_that_the_Status_for_your_template_in_the_table_with_and_Owner_name_and_with_Ready_to_Assign(String TemplateName,String Username) throws InterruptedException {
	    
		HomePage HP= PageFactory.initElements(driver, HomePage.class);
		HP.validate_edited_template(TemplateName, Username);
		
	}
	
	@Then("^Click copy icon of template and On the pop-up, enter unique Report Template Name \"([^\"]*)\"$")
	public void click_copy_icon_of_template_and_On_the_pop_up_enter_unique_Report_Template_Name(String TemplateName) throws InterruptedException {
	
		    
		
		HomePage HP= PageFactory.initElements(driver, HomePage.class);
		
		HP.copy_Template(TemplateName);	
	
		HP.Save();
	}

}
