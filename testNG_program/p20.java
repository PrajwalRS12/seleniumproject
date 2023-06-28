package testNG_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class p20
 {
	@Test
	public void actiloginscript() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   
 

   driver.manage().window().maximize();
   driver.get("https://demo.actitime.com/login.do");
   //identifies the text please identify yourself//
   WebElement text = driver.findElement(By.id("headerContainer"));
   //validates whether the text is displayed//
    Assert.assertEquals(text.isDisplayed(),true);
}

}

