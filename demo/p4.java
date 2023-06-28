		
package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class p4 
{
public static void main(String[] args)
{
/* sets the path for chromedriver.exe*/
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	
/*launches the chrome browser*/
	WebDriver driver =new ChromeDriver();
	
	
/*fetches the web app and waits until the page is loaded*/
	driver.get("https://www.facebook.com");

/*navigates to the specified url*/
	driver.navigate().to("https://www.flipkart.com");	
	
	
/*navigates backward*/
	driver.navigate().back();
	
/*navigates to forward*/
	driver.navigate().forward();
	
/*refresh the web page*/
	driver.navigate().refresh();
	
}	
}