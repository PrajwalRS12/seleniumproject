package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//program for getAttribute() and get cssValue//
public class p13 {

	public static void main(String[] args) throws InterruptedException
	
	{
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
       WebDriver driver = new ChromeDriver();

/*maximize the window*/
      driver.manage().window().maximize();

      
      
     driver.get("https://demo.actitime.com/login.do");
     
     
     /*identifies the loginbutton*/
     WebElement loginButton =  driver.findElement(By.id("loginButton"));

     /*retrives the attribute of the webelement*/
    String att1 = loginButton.getAttribute("class");
    String att2 = loginButton.getAttribute("href");
    String att3 = loginButton.getAttribute("onclick");
    
    
    
    System.out.println(att1);
    System.out.println(att2);
    System.out.println(att3);
    
    System.out.println("-----------------------------");
    
    
    
    /*retrives the attribute of the webelemnt*/
    
    
    
   String css1=loginButton.getCssValue("font-family");
   String css2=loginButton.getCssValue("font-size");
    System.out.println(css1);
    System.out.println(css2);
    
	}
}
