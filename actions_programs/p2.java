package actions_programs;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//program to drag and drop//
public class p2 {

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
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		//identifies Block1//
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		
		//identifies Block4//
		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
				
		
		
		//creates an object of actions class//
		Actions a = new Actions(driver);
		
		//perform mouseover on the specified webelement//
		a.dragAndDrop(block1,block4).perform();
		
}
}
