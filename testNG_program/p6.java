package testNG_program;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class p6 extends BaseTest1
{

	 @Test
	 public void facebookloginscript()
	 {

		 driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("abhi");

	 driver.findElement( By.id("pass")).sendKeys("aaaaa");


	   driver.findElement(By.name("login")).click();

		  driver.quit();
	 }

}
