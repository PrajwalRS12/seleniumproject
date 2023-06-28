package actions_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//program for right click//
public class p4 {

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
		driver.get("https://demo.actitime.com/login.do");
		
		//identifies the text//
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		
		
		
		//creates an object of actions class//
		Actions a = new Actions(driver);
		
		//perform mouseover on the specified webelement//
		a.contextClick(link).perform();
		
		
		//for opening the link in new window//
		//creates an object of Robot class// 
		
		Robot r = new Robot();
		
		
		//presses on w*//
		r.keyPress(KeyEvent.VK_W);
		
		
		//releases w*//
		r.keyRelease(KeyEvent.VK_W);
}
}
