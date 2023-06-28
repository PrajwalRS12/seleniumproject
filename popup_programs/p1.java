package popup_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p1 {

	public static void main(String[] args) throws InterruptedException
	
	{
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
       WebDriver driver = new ChromeDriver();

     //defines implictly wait of 30 sec//  
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       //works for findelement() only//
     
/*maximize the window*/
      driver.manage().window().maximize();

     driver.get("https://demo.actitime.com/login.do");

     
     
/*identifies userame and enters data*/
driver.findElement(By.name("username")).sendKeys("admin");

/*password and enter data*/
      driver.findElement(By.name("pwd")).sendKeys("manager");

/*identifies loginbutton and clicks*/
      driver.findElement(By.id("loginButtonContainer")).click();
  
      
      //identifies the userbtton and clicks//     
           driver.findElement(By.xpath("//a[@class='content users']")).click();

           
           
           //identifies the userbutton and clicks//     
    driver.findElement(By.xpath("//div[text()='New User']")).click();
   
    //pause for 1 sec//
    Thread.sleep(1000);
    
   //identifies the first name and enters the data// 
    driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys("abhi");
    //identifies the close button and clicks//
    driver.findElement(By.xpath("//div[contains(@class,'closeButton hide')]")).click();
    
    //creates an object of webdriverwait//
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

    //waits for the pop up//
  wait.until(ExpectedConditions.alertIsPresent());
   
 
}
}
