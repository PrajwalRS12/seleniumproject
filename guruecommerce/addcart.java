package guruecommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class addcart {

	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		   ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		  WebDriver driver=new ChromeDriver(options);
		  
		  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		driver.findElement(By.cssSelector("button[class='button btn-cart']")).click();
		driver.findElement(By.cssSelector("input[class='input-text qty']")).sendKeys("000");;
		driver.findElement(By.cssSelector("button[class='button btn-update']")).click();
		driver.findElement(By.xpath("//span[text()='Empty Cart']")).click();
		
		
	}
	
}
