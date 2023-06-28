package testNG_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p21 {

	@Test
	public void actiloginscript() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   
    driver.manage().window().maximize();
   driver.get("https://demo.actitime.com/login.do");
   //identifies the text please identify yourself//
   WebElement cb = driver.findElement(By.id("keepLoggedInCheckBoxContainer"));
   //validates whether the text is displayed//
   
    //Assert.assertEquals(cb.isSelected(),true);  OR //
   
   
   Assert.assertTrue(cb.isSelected());
  }

 }



