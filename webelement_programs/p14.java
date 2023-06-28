package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//program to get tagname//
public class p14 {

	public static void main(String[] args) throws InterruptedException
	
	{
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
       WebDriver driver = new ChromeDriver();

/*maximize the window*/
      driver.manage().window().maximize();

      
      
     driver.get("https://demo.actitime.com/login.do");
       
     WebElement actitimeInc = driver.findElement(By.linkText("actiTIME Inc."));
     
     String tn = actitimeInc.getTagName();
     System.out.println(tn);
     
     
     if(tn.equals("a"))
     {
    	 System.out.println("pass::its a link");
    	 
     }
     else {
    	 System.out.println("fail::not a link");
     }
     
     
     }
     }
     
    

