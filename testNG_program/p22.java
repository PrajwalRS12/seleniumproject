package testNG_program;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class p22 {


	@Test
	public void actiloginscript() throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

      WebDriver driver = new ChromeDriver();
      //validates whether the browser is launched//
      
      
      Set<String> windows = driver.getWindowHandles();
      
      SoftAssert s  = new SoftAssert();
      
      s.assertEquals(windows.size(),100);
      
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   
        driver.manage().window().maximize();  
    driver.get("https://demo.actitime.com/login.do");

  //validates whether the login page is loaded//
    
    
    
    String expectedLoginPageTitle = "actiTIME - Login";
 		   
   String actualLoginPageTitle  =  driver.getTitle();
  s.assertEquals(actualLoginPageTitle,expectedLoginPageTitle);
    

    
    driver.findElement(By.name("username")).sendKeys("admin");


     driver.findElement(By.name("pwd")).sendKeys("manager");


     driver.findElement(By.id("loginButton")).click();
   
    Thread.sleep(4000);
  
    
    //validates whether landing page is loaded// 
            String expectedLandingPageTitle = "actiTIME - Login";
          String expectedLandingPageUrl = "https://demo.actitime.com/user";
         String actualLandingPageTitle  =  driver.getTitle();     
         String actualLandingPageUrl  =  driver.getCurrentUrl();
            
            s.assertEquals(actualLandingPageTitle , expectedLandingPageTitle );
            s.assertEquals(actualLandingPageUrl ,expectedLandingPageUrl);
           
            s.assertAll();
     }
}


