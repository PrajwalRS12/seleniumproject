package popup_programs;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program for file upload pop up (System pop up)---Auto It Approach//
public class p13 {
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
		driver.get("https://www.naukri.com");

		//click on register button//
		driver.findElement(By.id("register_Layer")).click();
		
		//clicks on upload resume button //
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("./upload/fileupload.exe");
}
}
