package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p17 {



	public static void main(String[] args) throws InterruptedException
	
	{
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
       WebDriver driver = new ChromeDriver();

/*maximize the window*/
      driver.manage().window().maximize();

      
/*fetches the web app and waits until the page is loaded completely*/      
     driver.get("https://demo.actitime.com/login.do");
     
     //identifies the username//
     WebElement un = driver.findElement(By.name("username"));
     
     
   //check whether un is enabled//  
     System.out.println(un.isEnabled());
     
     System.out.println("-------------------");
     
     
     
   WebElement cb =driver.findElement(By.id("keepLoggedInCheckBox"));
   
   
  
   System.out.println(cb.isSelected());
   
   
   //clicks on check box//
   cb.click();
   
   //checks whether cb is selected//
   System.out.println(cb.isSelected());
   
   
}
}