package testNG_program;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest3 {

	WebDriver driver;
	
    @Parameters("BrowserName")
	@BeforeMethod 
	public void precondition(String BN)
	{
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

         if(BN.equals("chrome"))
        	  driver = new ChromeDriver();
         else if(BN.equals("firefox"))
		      driver = new FirefoxDriver();
         
         
         
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	        driver.manage().window().maximize();
		
	}
	
	

		@AfterMethod
       public void postcondition()
         {
	       driver.quit();
         }
		
		 @Parameters("BrowserName")
		 @BeforeTest
		 public void beforetest(String BN)
		 {
			 System.out.println(BN+"test started the execution"); 
		 }
		 

		 @Parameters("BrowserName")
		 @AfterTest
		 public void aftertest(String BN)
		 {
			 System.out.println(BN+"test completed the execution");
		 }

		   @BeforeSuite
		   public void beforesuite()
		   {
			   System.out.println("Automation suite started the execution");
		   }
		   
		   @AfterSuite
		   public void aftersuite()
		   {
			   System.out.println("Automation suite completed the execution");
		   }
		   
}
