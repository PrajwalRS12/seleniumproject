package testNG_program;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class p7 extends BaseTest2{

	@Test
    public void actiloginscript()
     {
		
   
    driver.get("https://demo.actitime.com/login.do");

    driver.findElement(By.name("username")).sendKeys("admin");


     driver.findElement(By.name("pwd")).sendKeys("manager");


     driver.findElement(By.id("loginButton")).click();
   

     }
} 


