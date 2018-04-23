package StepDefinition;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public interface Utils {

	public WebDriver driver=new ChromeDriver(); 
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss"); 
    Date date = new Date();
    String FinalDate = dateFormat.format(date);

	
	
	//Login Page
	
	public static final String UserID ="username"; //name
	
	public static final String btnNext = "//button[@class='btn btn-default btn-block ng-scope']";//xpath
	
	
	//Navigating to Add account screen
	
	public static final String btnAddAcc ="//span[@class='badge ca-badge-btn label-success' and .='Add Account']";
	 
	public static final String tabAuthentication="//a[.='Authentication']";
	
	//Add Accounts- Authentication tab
	
	public static final String txtAccName ="//input[@class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required ng-valid-pattern ng-valid-maxlength' and contains(@placeholder,'Enter Account Name (5-50) characters')]";
	
	public static final String txtDescp = "//textarea[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']";//xpath
	
    public static final String btnNone = "//a[@class='oval-btn oval-flat-btn pull-left ng-binding ng-scope toggle-fs-btn active']";//xpath
    
    public static final String btnExpress = "//a[@class='oval-btn oval-flat-btn pull-left ng-binding ng-scope']";//xpath
	
	public static final String btnCustom = "//a[.=' Custom']";//xpath
	
	public static final String drpEnvmt =".//*[@id='auth_tab']/form/div[1]/div[4]/select";
	
	//public static final String drpEnvmt = "//select[@class='form-control ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched' and @name='selectedEnv']";//xpath
	
	public static final String drpScope = "//select[@class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']";//xpath
	
	public static final String txtTenant_ID = "//input[@id='tenant_id']";
	
	public static final String txtApp_ID = "//input[@id='application_id']";
	
	public static final String txtApp_Sec = "//input[@id='application_secret']";
	
	public static final String btnGenerate = "//a[@class='btn btn-default circle-new-btn ng-binding']";
	
	public static final String drpSubscriptionID=".//*[@id='auth_tab']/form/div[2]/div[5]/select";
	
	public static final String btnNext_ADD = "//a[@class='btn btn-default save-btn ng-scope']";
	
	public static String approver_chkbox ="//h5[.='approver']//following-sibling::label[@class='checkbox checkbox-inline']";
	
	public static String consumer_chkbox ="//h5[.='consumer']//following-sibling::label[@class='checkbox checkbox-inline']";
	
	public static String btnFinish = "//a[@class='btn btn-default ca-finish save-btn ng-scope' and .='Finish']";
    
    
    // templates tab
    
    public static String tabTemplates="//i[@class='icon-templates fn25 mini-navbar-icon']";
    
    public static String tabMarketplace="//a[.=' Marketplace']";
    
    //Search template
    
    public static String txtSearch="//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']";
    
    public static String imgSearch ="//i[@class='ion-ios-search-strong plain-cursor']";
    
    
    //execute template
    
   // public static String imglefticons ="//div[@class='srp-btn']";
    		
    public static String imglefticons ="//a[@id='tempDotIcon']";
    
    public static String imgExecute ="//a[@class='circle-btn pull-right m-r-xs ng-scopee' and contains(@data-original-title,('Execute'))]";
    
    public static String titlepopup ="//button[@class='close']//following-sibling::h4[.='Execute Template']";
    
    
  //  public static String imgSearch ="//i[@class='ion-ios-search-strong plain-cursor']";
   // public static String imgSearch ="//i[@class='ion-ios-search-strong plain-cursor']";*/
   
  
    
  
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
