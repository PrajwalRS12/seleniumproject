package testNG_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class p13 {

	
	@DataProvider(parallel=true)
	public Object[][] loginData()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="admin";
		data[0][1]="manager";
		data[1][0]="trainee";
		data[1][1]="trainee";
		data[2][0]="abhi";
		data[2][1]="12345";
		return data;
	}
	
	@Test(dataProvider="loginData")
    public void actiloginscript(String un, String pw)
     {

	     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");


		   ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver(options);
		
	     

	     
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	        driver.manage().window().maximize();
   
    driver.get("https://demo.actitime.com/login.do");

    driver.findElement(By.name("username")).sendKeys(un);


     driver.findElement(By.name("pwd")).sendKeys(pw);


     driver.findElement(By.id("loginButton")).click();
   

     }
}

