package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p12 {
	
	public static void main(String[] args) throws InterruptedException
	
	{
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
       WebDriver driver = new ChromeDriver();

/*maximize the window*/
      driver.manage().window().maximize();

      
      
     driver.get("https://demo.actitime.com/login.do");
     
     
     /*identifies username and enters data*/
     WebElement un =  driver.findElement(By.name("username"));

     /*password and enter data*/
     WebElement pw= driver.findElement(By.name("pwd"));

     /*retrieves the height and width of username*/
     int h1 = un.getSize().getHeight();
     int w1 = pw.getSize().getWidth();
	
     /*retrieves the height and width of password*/
     int h2 = un.getSize().getHeight();
     int w2 = pw.getSize().getWidth();
     
     
  /*validates whether username and password are of same dimension*/   
     if(h1==h2 && w1==w2) 
     {
    	 System.out.println("pass::they are of same dimension");
     }
     else 
     {
    	 System.out.println("pass::they are not of same dimension");
     }
     
     
     
     }
     }
	
     
	