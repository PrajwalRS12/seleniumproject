package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actitimeEnterTimeTrack_Page;
import POM_pages.actitimeEnterTimeTrack_Page2;
import POM_pages.actitimeLogin_Page;
import POM_pages.actitimeLogin_Page2;
import POM_pages.actitimeUsersList_page;
import POM_pages.actitimeUsersList_page2;
import POM_pages.addUser_page;
import POM_pages.addUser_page2;
import POM_pages.initialisePages;

//script for add user//
public class adduserscript3 {


public static void main(String[] args) throws InterruptedException
	
	{
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
       WebDriver driver = new ChromeDriver();

   //defines implictly wait of 30 sec//  
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    //works for findelement() only//
     
/*maximize the window*/
      driver.manage().window().maximize();

     driver.get("https://demo.actitime.com/login.do");

	initialisePages pages  = new initialisePages(driver);
	  
	pages.actitimeLogin.login("admin", "manager");
	
	pages.actitimeEnterTimeTrack.clickusers();
	
	pages.actitimeUsersList.clickNewusers();
	
	Thread.sleep(2000);
	
	pages.addUser.createUser("adc", "b", "abc@gmail.com");
	
	
	}
}