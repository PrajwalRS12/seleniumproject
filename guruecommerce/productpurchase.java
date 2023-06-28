package guruecommerce;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class productpurchase {

	

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
	      

	driver.findElement(By.xpath("//li[@class='current']")).click();
	
	 driver.findElement(By.cssSelector("button[class='button btn-cart']")).click();
	 WebElement tb =driver.findElement(By.id("country"));
	  Select s = new Select(tb);
	  s.selectByValue("US");
	  
	  WebElement tb1 =driver.findElement(By.id("region_id"));
	  Select n = new Select(tb1);
	  n.selectByValue("43");
	  
	  driver.findElement(By.id("postcode")).sendKeys("542896");
	 
	  driver.findElement(By.xpath("//span[text()='Estimate']")).click();
	  driver.findElement(By.id("s_method_flatrate_flatrate")).click();
	  driver.findElement(By.xpath("//button[@name='do'] ")).click();
	  
	  
	 String vc = "$620.00";
			 
	String dc = driver.findElement(By.xpath("//td/strong/span")).getText();
			
	System.out.println("vc = "+dc);
	
	
	try 
	{
			 assertEquals(vc, dc);
	 }
	 catch (Exception e) 
	{
		System.out.println("Not Equal");
	}
	
	
	
	driver.findElement(By.xpath("(//button[@class='button btn-proceed-checkout btn-checkout'])[2]")).click();
	driver.findElement(By.xpath("(//button[@class='button'] )[1]")).click();
	driver.findElement(By.xpath("(//button[@class='button'] )[2]")).click();
	driver.findElement(By.xpath("//input[@id='p_method_checkmo']")).click();
	driver.findElement(By.xpath("(//button[@class='button'] ) [2]")).click();
	driver.findElement(By.xpath("//button[@class='button btn-checkout'] ")).click();
	
	
	String s1 ="THANK YOU FOR YOUR PURCHASE!";
	String s2  = driver.findElement(By.xpath("//h2[@class='sub-title']")).getText();
	System.out.println("s1 ="+s2);
	
	try
	{
		assertEquals(s1, s2);
	}
	catch( Exception e)
	{
		System.out.println("not ordered");
	}
	
	driver.findElement(By.xpath("//p[contains(text(),'Your order # is: ')]")).getText();
	
	driver.close();
	
	 
	
	
	
}	
}
