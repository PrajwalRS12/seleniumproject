package guruecommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class purchase
{
public static void main(String[] args) {
	


	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	   ChromeOptions options = new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver(options);
	  
	  
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://live.techpanda.org/");
	 driver.findElement(By.linkText("MY ACCOUNT")).click();
	driver.findElement(By.cssSelector("a[class='button']")).click();

	
	driver.findElement(By.id("email")).sendKeys("Berry123@tpg.com.au");
	driver.findElement(By.id("pass")).sendKeys("mar8mar");
	driver.findElement(By.id("send2")).click();
	driver.findElement(By.linkText("My Wishlist")).click();
	driver.findElement(By.cssSelector("a[class='skip-link skip-cart']")).click();
	driver.findElement(By.cssSelector("a[class='button checkout-button']")).click();
	
	
}
}
