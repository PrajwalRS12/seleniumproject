package testNG_program;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import POM_pages.actitimeEnterTimeTrack_Page;
import POM_pages.actitimeLogin_Page;
import POM_pages.actitimeUsersList_page;
import POM_pages.addUser_page;
import POM_pages.initialisePages;

public class p14
    {

     @Test(dataProviderClass=actitimeDataproviders.class,dataProvider="addUserData")	
      public void addusersscript(String un,String pw,String fn,String ln,String em ) throws InterruptedException
	
	{	


System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");


ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");

WebDriver driver = new ChromeDriver(options);




  
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    

      driver.manage().window().maximize();

     driver.get("https://demo.actitime.com/login.do");

	initialisePages pages  = new initialisePages(driver);
	  
	pages.actitimeLogin.login(un, pw);
	
	pages.actitimeEnterTimeTrack.clickusers();
	
	pages.actitimeUsersList.clickNewusers();
	
	Thread.sleep(2000);
	
	pages.addUser.createUser(fn,ln,em);
	
	}
		
}
