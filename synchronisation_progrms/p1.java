package synchronisation_progrms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//implicitly wait//
public class p1 {

	public static void main(String[] args) throws InterruptedException
	
	{
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
       WebDriver driver = new ChromeDriver();

     //defines implictly wait of 30 sec//  
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
     
/*maximize the window*/
      driver.manage().window().maximize();

     driver.get("https://demo.actitime.com/login.do");

/*identifies userame and enters data*/
driver.findElement(By.name("username")).sendKeys("admin");

/*password and enter data*/
      driver.findElement(By.name("pwd")).sendKeys("manager");

/*identifies loginbutton and clicks*/
      driver.findElement(By.id("loginButtonContainer")).click();
  
  
 /*pause the execution for 4sec*/
       Thread.sleep(30000);
   
  //identifies the userbtton and clicks//     
       driver.findElement(By.xpath("//a[@class='content users']")).click();
}
	
}
