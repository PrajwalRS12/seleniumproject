package popup_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program for hidden pop up //
public class p6 {

	public static void main(String[] args) throws InterruptedException
	{
	/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
	/*launches the chrome browser*/
		WebDriver driver =new ChromeDriver();
	
		
	     //defines implictly wait of 30 sec//  
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();

	/*navigates to the specified url*/
		driver.get("https://www.axisbank.com/");	
		
		//identifies and clicks on close button//
		driver.findElement(By.xpath("//div[@class='close_button']")).click();
		
}
}


