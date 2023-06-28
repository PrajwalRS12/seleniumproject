package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class p3 {
public static void main(String[] args) {
/* sets the path for chromedriver.exe*/
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	
/*launches the chrome browser*/
	WebDriver driver =new ChromeDriver();
	
	
/*fetches the web app and waits until the page is loaded*/
	driver.get("https://www.facebook.com");
	
/*maximizes the window*/
	driver.manage().window().maximize();
	
/*minimize the window*/
	driver.manage().window().minimize();
	
/*full screens the  window*/
	driver.manage().window().fullscreen();

	
	
}
}
