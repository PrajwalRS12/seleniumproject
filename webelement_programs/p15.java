package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p15 {

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
     
     
     Thread.sleep(30000);
      //identifies the actitime for free// 
     WebElement element= driver.findElement(By.xpath("//div[text()='start with actiTIME for free']"));
     
  //retrieves the x and y coordinate of the webelement//   
     int x = element.getLocation().getX();
     int y = element.getLocation().getY();
     
     System.out.println(x  +","+  y);

}}