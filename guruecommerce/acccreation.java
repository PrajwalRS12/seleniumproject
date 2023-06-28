package guruecommerce;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class acccreation {

public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	   ChromeOptions options = new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver(options);
	  
	  
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://live.techpanda.org/");
	 driver.findElement(By.linkText("MY ACCOUNT")).click();
	
	driver.findElement(By.id("email")).sendKeys("Berry123@tpg.com.au");
	driver.findElement(By.id("pass")).sendKeys("mar8mar");
	driver.findElement(By.id("send2")).click();
	
	
    driver.findElement(By.xpath(".//*[@id='nav']/ol/li[2]/a")).click();
         
    driver.findElement(By.xpath("//li/a[@class='link-wishlist']")).click();
      
  driver.findElement(By.xpath("//button[@title='Share Wishlist']")).click();

    driver.findElement(By.id("email_address")).clear();
    driver.findElement(By.id("email_address")).sendKeys("support@guru99.com");
    driver.findElement(By.id("message")).clear();
    driver.findElement(By.id("message")).sendKeys("Hey Mary!! this LCD TV looks ok, check it out !!.. cheers .. Berry");
    
    driver.findElement(By.xpath("//button[@title='Share Wishlist']")).click();
    
   
    String vWishList = "Your Wishlist has been shared.";
    String wishList = driver.findElement(By.xpath("//div/ul/li/ul/li/span")).getText();
    System.out.println("wishList = "+wishList);
    
    try {	    	
    	assertEquals(vWishList, wishList);
	    } 
    catch (Exception e) 
    {
	    	e.printStackTrace();	  
	    }	
    	    
}
	}
