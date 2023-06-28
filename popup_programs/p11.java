package popup_programs;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p11 {
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
		driver.get("https://www.monster.com");

		//identifies upload resume button and click//
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		
		//identifies select file to upload button and clicks//
		driver.findElement(By.xpath("//button[text()='Or select file to upload']/parent::div")).click();;
		Thread.sleep(2000);
		
		//file upload method is called to handle the pop up//
		p10.fileupload("C:\\selenium_workspace\\selenium_project\\upload\\resume.docx");
		//identifies the submit button and clicks//
		driver.findElement(By.id("pop_upload")).click();
}}
