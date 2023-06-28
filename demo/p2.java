package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class p2
{
	

public static void main(String[] args)
{
	

/* sets the path for chromedriver.exe*/
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	
/*launches the chrome browser*/
	WebDriver driver =new ChromeDriver();
	
	
/*fetches the web app and waits until the page is loaded*/
	driver.get("https://www.facebook.com");
	
/*retrievs the title of web page*/
	String loginpagetitle  = driver.getTitle();
	 System.out.println(loginpagetitle);
	
/*retrievs the url of web page*/
	 String loginpageurl = driver.getCurrentUrl();
	 System.out.println(loginpageurl);
	 
/*retrievs the source code of web page*/
	 String  sourcecode = driver.getPageSource();
	 System.out.println(sourcecode);
	 
}
}
	
	