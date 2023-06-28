package popup_programs;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//program for notification and geolocation pop up//
public class p12 {
public static void main(String[] args) throws InterruptedException, AWTException
	
	{
	/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		//creates an object of chromeoptions//
	ChromeOptions options = new ChromeOptions();	
		
	
	//disables notification//
	options.addArguments("--disable-notifications");
	
	//disables geolocation notification//
	options.addArguments("--disable-geolocation");
		
	/*launches the chrome browser*/
		WebDriver driver =new ChromeDriver(options);
		
		
			
    //defines implictly wait of 30 sec//  
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
	/*fetches the web app and waits until the page is loaded*/
		driver.get("https://www.hdfcbank.com");

}
}



