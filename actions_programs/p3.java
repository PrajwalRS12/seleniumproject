package actions_programs;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//program for double click//
public class p3 {

public static void main(String[] args) throws InterruptedException, AWTException, IOException
	
	{
	/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
	/*launches the chrome browser*/
		WebDriver driver =new ChromeDriver();
		
    //defines implictly wait of 30 sec//  
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
	/*fetches the web app and waits until the page is loaded*/
		driver.get("///C:/Users/Thejaswi%20R%20S/Downloads/eclipse-java-2018-09-win32-x86_64/eclipse/doubleclick.html");
		
		//identifies the text//
		WebElement text = driver.findElement(By.id("demo"));
		
		
		
		//creates an object of actions class//
		Actions a = new Actions(driver);
		
		//perform mouseover on the specified webelement//
		a.doubleClick(text).perform();
		
}
}