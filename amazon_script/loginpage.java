package amazon_script;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pom_for_amazon.amazonloginpage;

public class loginpage {

	public static void main(String[] args) 
	
	
	{
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.com");
	
	amazonloginpage l=new amazonloginpage(driver);
	l.login("rsprajwal2@gmail.com"," 8867481216@Rs");
	}

	}

