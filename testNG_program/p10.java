package testNG_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class p10 {
 
	@Test
	  public  void geckodriver()
	  
	  {
		

	     System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");


	       WebDriver driver = new FirefoxDriver();

			 driver.get("https://www.facebook.com/");
}
}