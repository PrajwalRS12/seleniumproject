package findElements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 
{
	public static void main(String[] args)
	{
	/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
	/*launches the chrome browser*/
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();

	/*navigates to the specified url*/
		driver.get("https://www.flipkart.com");	
		
		driver.findElement(By.xpath("//button[@class='_36HLxm col col-3-5']")).click();
		
		
		 driver.findElement(By.xpath("//input[@class='_1cmsER']")).sendKeys("woodland shoes");
		
		
		driver.findElement(By.xpath("//button[@class='_1cmsER']")).click();
		
		
	}	
}


