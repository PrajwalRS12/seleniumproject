package testNG_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p3 {


	  @Test
	  public void actiloginscript()
	  {

	     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");


	       WebDriver driver = new ChromeDriver();

	     
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	        driver.manage().window().maximize();

	         driver.get("https://demo.actitime.com/login.do");



	     driver.findElement(By.name("username")).sendKeys("admin");


	      driver.findElement(By.name("pwd")).sendKeys("manager");


	      driver.findElement(By.id("loginButton")).click();
	    
	         driver.quit();  
	  }
	  
	  @Test
	  public void facebookloginscript()
	  {


          System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

       driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");



     driver.findElement(By.id("email")).sendKeys("abhi");
    
      driver.findElement( By.id("pass")).sendKeys("aaaaa");


        driver.findElement(By.name("login")).click();

		  driver.quit();
	  }
}
