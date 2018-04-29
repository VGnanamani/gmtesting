package stepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.AccountsPage;
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

	
	@Then("^In the table, in the Name column, enter the unique report template name \"([^\"]*)\" and \"([^\"]*)\" Owner name \"([^\"]*)\"$")
	public void in_the_table_in_the_Name_column_enter_the_unique_report_template_name_and_Owner_name(String TemplateName, String Description, String Username) throws InterruptedException {
	    
		HomePage HP= PageFactory.initElements(driver, HomePage.class);
		HP.search_template_Delete(TemplateName, Description , Username);
		
		
		
		
	}

	@Then("^click Delete button and ok in conformation$")
	public void click_Delete_button_and_ok_in_conformation() {
		HomePage HP= PageFactory.initElements(driver, HomePage.class);
		
		HP.Delete_Template();
	}

/*	private List<String> Parse(String str) {
	    List<String> output = new ArrayList<String>();
	    Matcher match = Pattern.compile("[0-9]+|[a-z]+|[A-Z]+").matcher(str);
	    while (match.find()) {
	        output.add(match.group());
	    }
	    return output;
	}
	
	*
	*
	Pattern p = Pattern.compile("[a-z]+|\\d+");
Matcher m = p.matcher("123abc345def");
ArrayList<String> allMatches = new ArrayList<>();
while (m.find()) {
    allMatches.add(m.group());
}*/
	
	
	@Then("^Click User Accounts menu and click Account Holdings$")
	public void click_User_Accounts_menu_and_click_Account_Holdings() throws InterruptedException {
	    
		Thread.sleep(10000);
		
		MenuoptionsPage MP= PageFactory.initElements(driver, MenuoptionsPage.class);
		MP.navigate_UserAccount();
		MP.navigate_AccountHolding();
		
	}

	@Then("^Enter \"([^\"]*)\" in textbox and apply filter$")
	public void enter_in_textbox_and_apply_filter(String AccName) throws InterruptedException {
		
		AccountsPage AP=PageFactory.initElements(driver, AccountsPage.class);
		
		AP.Applyfilter(AccName);
	    
	}

	@Then("^get the value from Current value USD given in Networth as of date$")
	public void get_the_value_from_Current_value_USD_given_in_Networth_as_of_date() {
	   
	}
	
	
	@Then("^close the browser$")
	public void close_the_browser() {
	    driver.close();
	}
	
}
