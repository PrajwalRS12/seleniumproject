package apache_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.initialisePages;

public class p6 {

public static void main(String[] args) throws Throwable
	
	{
//read the data from property file//
	FileInputStream f=new FileInputStream("./data/actitime.properties");
	
	Properties p = new Properties();
	
	p.load(f);
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
       WebDriver driver = new ChromeDriver();

   //defines implictly wait of 30 sec//  
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    //works for findelement() only//
     
/*maximize the window*/
      driver.manage().window().maximize();

     driver.get(p.getProperty("url"));

	initialisePages pages  = new initialisePages(driver);
	  
	pages.actitimeLogin.login(p.getProperty("username"),p.getProperty("password"));
	
	pages.actitimeEnterTimeTrack.clickusers();
	
	pages.actitimeUsersList.clickNewusers();
	
	Thread.sleep(2000);
	
	pages.addUser.createUser(p4.getData("adduser", 1, 0),
			                 p4.getData("adduser", 1, 1),
			                 p4.getData("adduser", 1, 2));
	
	
	
	
	}
}

