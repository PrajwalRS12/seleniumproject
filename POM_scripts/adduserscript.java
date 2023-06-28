package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actitimeEnterTimeTrack_Page;
import POM_pages.actitimeLogin_Page;
import POM_pages.actitimeUsersList_page;
import POM_pages.addUser_page;

//script for add user//
public class adduserscript {


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
	
	
//creates an object of actitimeEnterTimeTrack_Page class//
	actitimeEnterTimeTrack_Page ob2 = new actitimeEnterTimeTrack_Page(driver);
	
	
	//clicks on users button//

	ob2.lnkUsers.click();
	
	//creates an object of actitimeUsersList_Page class//
	actitimeUsersList_page ob3 = new actitimeUsersList_page(driver);
	
	//clicks on new user button//
	ob3.btnNewUser.click();
	
	
	//pause for 2 sec//
	Thread.sleep(2000);
	
	
	//creates an object of adduser_page class//
	addUser_page ob4 = new addUser_page(driver);

	//enters firstname//
	ob4.tbFirstName.sendKeys("abhi");
	
	//enters lasname//
	ob4.tbLastName.sendKeys("b");
	
	
	//enters Email//
	ob4.tbEmail.sendKeys("abc@gmail.com");
	
	//clicks on save button//
	ob4.btnSave.click();
	}
}