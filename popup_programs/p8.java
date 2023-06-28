package popup_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program for file upload pop up (system pop up)----Robot class Approach//
public class p8 {

	public static void main(String[] args) throws InterruptedException, AWTException
	
	{
	/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
	/*launches the chrome browser*/
		WebDriver driver =new ChromeDriver();
		
    //defines implictly wait of 30 sec//  
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
	/*fetches the web app and waits until the page is loaded*/
		driver.get("https://www.naukri.com");

		//click on register button//
		driver.findElement(By.id("register_Layer")).click();
		
		//clicks on upload resume button //
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	
		Thread.sleep(3000);
		
		fileupload();
	}	
	

	
		
	


	public static void fileupload() throws AWTException{
		 
		StringSelection s = new StringSelection("C:\\selenium_workspace\\selenium_project\\upload\\resume.docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	

	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	

	r.keyPress(KeyEvent.VK_ENTER);
	
	

	r.keyRelease(KeyEvent.VK_ENTER);

	
	
	
	}
}
