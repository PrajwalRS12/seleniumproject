package projectguru;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class gurulogin {
	
	public static void main(String[] args) 
	{
	

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	

	   ChromeOptions options = new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
	 
	WebDriver driver = new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://www.demo.guru99.com/v4/");
	
	driver.findElement(By.name("uid")).sendKeys("Userid");;
	
	driver.findElement(By.name("password")).sendKeys("Password");;
	
	driver.findElement(By.name("btnLogin")).click();;
	}
}
