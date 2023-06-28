package synchronisation_progrms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p7 {

	public static void main(String[] args) throws InterruptedException
	
	{	

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
   WebDriver driver = new ChromeDriver();

 //creates an object of webdriverwait//  
   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
   
   
 
/*maximize the window*/
  driver.manage().window().maximize();

 driver.get("https://demo.actitime.com/login.do");

/*identifies userame and enters data*/
driver.findElement(By.name("username")).sendKeys("admin");

/*password and enter data*/
  driver.findElement(By.name("pwd")).sendKeys("manager");

/*identifies loginbutton and clicks*/
  driver.findElement(By.id("loginButtonContainer")).click();

   FluentWait Wait = new FluentWait(driver);
  
    Wait.pollingEvery(Duration.ofMillis(250));

  Wait.withTimeout(Duration.ofSeconds(30));

   Wait.ignoring(NoSuchElementException.class);



//waits for the visibility of users button//
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='content users']")));


//identifies the userbtton and clicks//     
driver.findElement(By.xpath("//a[@class='content users']")).click();
}
}
