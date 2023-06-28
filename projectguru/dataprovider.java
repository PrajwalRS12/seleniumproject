package projectguru;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider
{

	@DataProvider
	public Object[][] gurudata()
	{
		Object[][] gd= {{"mngr507457","uhAzUqu"}};
		
		return gd;
	}
	
	@Test(dataProvider="gurudata")
    public void gurulogin(String un, String pw) throws Throwable
     {

	     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");


		   ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.demo.guru99.com/v4/");
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	        driver.manage().window().maximize();
	    
	        pom obg = new pom(driver);
			
			obg.login(un,pw);
			
		WebElement	id=driver.findElement(By.xpath("//td[text()='Manger Id : mngr507457']"));
			System.out.println(id.isDisplayed());
			
	   TakesScreenshot gs = (TakesScreenshot)driver;
	   File sr =gs.getScreenshotAs(OutputType.FILE);
	   File de =new File("./screenshot/bankss.png");
	   FileUtils.copyFile(sr, de);
	   
     }
}
