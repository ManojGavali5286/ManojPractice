package TestClass;


import java.io.IOException;
import java.time.Duration;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import POMClasses.POMClass_LoginPage;

 

public class TestBaseClass 
{
   WebDriver driver;
   
   Logger log = Logger.getLogger("SauceDemoProject-30JulyBatch");
	
    @Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"./DriverFolder/chromedriver.exe");			
			driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", 
					"./DriverFolder/geckodriver.exe");			
			driver = new FirefoxDriver();		
		}
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("browser is opened");
						
		driver.manage().window().maximize();	
		log.info("browser is maximized");
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		log.info("url is opened");
		
		//screenshot
		//UtililityClass.screenShotMethod(driver, "Loginpakaj");
		
		POMClass_LoginPage lp = new POMClass_LoginPage(driver);
		lp.sendUsername();
		log.info("usernaeme is entered");
		
		lp.sendPassword();
		log.info("password eneterd");
		
		lp.clickLoginButton();
		log.info("clicked on login button");
		
		//--homePage--//
		log.info("Went on HomePage");
				
		//screenshot
	//	UtililityClass.screenShotMethod(driver, "PankajHome");			
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("browser is closed");
				
		log.info("End of Program");
	}

}
