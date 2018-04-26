package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDrivers {

	static WebDriver driver;
	
	public static WebDriver LaunchBrowser(String browserName,String URl)
	
	{
		if(browserName.equalsIgnoreCase("firefox"))
			
		{
			System.setProperty("webdriver.gecko.driver","");
			driver=new FirefoxDriver();
			System.out.println("Firefox Selected");
		}
			
		else if(browserName.equalsIgnoreCase("chrome"))	

		{
			
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	
	
driver.manage().window().maximize();

driver.get(URl);
return driver;
	}

	
}
