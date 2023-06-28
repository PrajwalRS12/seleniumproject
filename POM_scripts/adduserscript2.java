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

//script for add user//
public class adduserscript2 {


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
		actitimeLogin_Page2 ob1 = new actitimeLogin_Page2(driver);

	
		ob1.login("admin", "manager");
	
//creates an object of actitimeEnterTimeTrack_Page class//
	actitimeEnterTimeTrack_Page2 ob2 = new actitimeEnterTimeTrack_Page2(driver);
	//clicks on user//
	ob2.clickusers();
	//creates an object of actitimeuserlist_page@ class//
	actitimeUsersList_page2 ob3 = new actitimeUsersList_page2(driver);
	
	//clicks on new users//
	  ob3.clickNewusers();
	  //pause for 2 sec//
	  Thread.sleep(3000);
	
	  //creates an object of adduser_page2 class//
	addUser_page2 ob4 = new addUser_page2(driver);
	
	
	//enters the frst name, last name ,mail//
	ob4.createUser("abhi", "ss", "abc@gmailcom");
	
	
	
	
	
			
			

	}
}