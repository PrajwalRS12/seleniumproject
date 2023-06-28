package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actitimeEnterTimeTrack_Page;
import POM_pages.actitimeLogin_Page;

public class logoutscript {

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

		//creates an object of actitimeLoginPage class//
		actitimeLogin_Page ob1 = new actitimeLogin_Page(driver);
		
		//enters username//
	ob1.tbusername.sendKeys("admin");
	
	//enters password//
	ob1.tbPassword.sendKeys("manager");
	
	//click on login button//
	ob1.btnLogin.click();
	
	
//creates an oject of actitimeEnterTimeTrack_Page class//
	actitimeEnterTimeTrack_Page ob2 = new actitimeEnterTimeTrack_Page(driver);
	
	//clicks on logout button//

	ob2.btnLogout.click();
}
}
