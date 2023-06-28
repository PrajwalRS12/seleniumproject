package testNG_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class p2 

{
	
	
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


      driver.findElement(By.id("loginbutton")).click();
    
         driver.quit();  
  }
  
}
