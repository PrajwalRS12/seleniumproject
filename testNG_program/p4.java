package testNG_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class p4 {

	WebDriver driver;
	
	@BeforeMethod 
	public void precondition()
	{
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");


	      driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	        driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
	}
	
	@Test
public void actiloginscript()
{
    driver.get("https://demo.actitime.com/login.do");

    driver.findElement(By.name("username")).sendKeys("admin");


     driver.findElement(By.name("pwd")).sendKeys("manager");


     driver.findElement(By.id("loginButton")).click();
   
         
 }
 
 @Test
 public void facebookloginscript()
 {

	 driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("abhi");

 driver.findElement( By.id("pass")).sendKeys("aaaaa");


   driver.findElement(By.name("login")).click();

	  
 }
}



