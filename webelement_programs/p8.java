package webelement_programs;

import java.rmi.UnexpectedException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8
{

	public static void main(String[] args) throws InterruptedException
	
	{
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
       WebDriver driver = new ChromeDriver();

/*maximize the window*/
      driver.manage().window().maximize();

     driver.get("https://demo.actitime.com/login.do");

/*identifies userame and enters data*/
driver.findElement(By.name("username")).sendKeys("admin");

/*password and enter data*/
      driver.findElement(By.name("pwd")).sendKeys("manager");

/*identifies loginbutton and clicks*/
      driver.findElement(By.id("loginbutton")).click();
  
  
 /*pause the execution for 4sec*/
       Thread.sleep(4000);
   
   
/*  expected landing page title*/
       String expectedLandingPageTitle = "actiTIME -Login";
    		   
 /*  expected landing page url*/
    		   String expectedLandingPageUrl = "https://demo.actitime.com/login.do";
    		   
/*actual landing page title*/
    		   String actualLandingPageTitle  =  driver.getTitle();
       
 /*actual landing page url*/
       String actualLandingPageUrl  =  driver.getCurrentUrl();
       
       
       
       
/*validates the login*/
       if((expectedLandingPageTitle.equals(actualLandingPageTitle))&&(expectedLandingPageUrl.equals(actualLandingPageUrl)))
       { 
    	   System.out.print("Pass:login is successfull");
       
       }
       else 
       {
    	   System.out.print("Pass:login is unsuccessfull");
       }
}


}
