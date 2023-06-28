package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//program for is displayed//
public class p16 {


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
     
 //identifies the text//    
     WebElement text = driver.findElement(By.id("headerContainer"));
     
     
     
  //check whether the text is displayed//   
     System.out.println(text.isDisplayed());
     
     
     
    //validates whether login page is loaded// 
     if(text.isDisplayed()) {
    	 
    	 System.out.println("pass:: login page is loaded");
    	 
     }
     else 
     {
    	 System.out.println("fail:: login page is not loaded");
    	 }
     }
}
