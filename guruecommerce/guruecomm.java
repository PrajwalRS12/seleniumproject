package guruecommerce;

import java.time.Duration;

import org.apache.commons.math3.ode.events.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class guruecomm {


	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		   ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		  WebDriver driver=new ChromeDriver(options);
		  
		  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://live.techpanda.org/");
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		driver.findElement(By.cssSelector("a[class='link-compare']")).click();
		driver.findElement(By.cssSelector("a[class='link-compare']")).click();
		driver.findElement(By.xpath("(//a[text()='Add to Compare'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Add to Compare'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='button']")).click();
        driver.findElement(By.cssSelector("button[class='button']")).click();
        driver.findElement(By.cssSelector("a[class='button']")).click();
    	
    	driver.findElement(By.id("firstname")).sendKeys("Prajwal");
    	driver.findElement(By.id("middlename")).sendKeys("R");
    	driver.findElement(By.id("lastname")).sendKeys("S");
    	driver.findElement(By.id("email_address")).sendKeys("Berry123@tpg.com.au");
    	driver.findElement(By.id("password")).sendKeys("mar8mar");
    	driver.findElement(By.id("confirmation")).sendKeys("mar8mar");
    	driver.findElement(By.cssSelector("button[class='button']")).click();
    	
    	
	}

	}
