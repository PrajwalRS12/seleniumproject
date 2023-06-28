package popup_programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//program for javascript pop up( pop up)//
public class p3 {

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

     driver.get("file:///C:/Users/Thejaswi%20R%20S/Downloads/eclipse-java-2018-09-win32-x86_64/eclipse/alert.html");

     
      
      //identifies the userbtton and clicks//     
           driver.findElement(By.xpath("//button[text()='Try it']")).click();

           
           
      
    //creates an object of webdriverwait//
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

    //wait for the pop up//
    wait.until(ExpectedConditions.alertIsPresent());
    
    
    //switches the control to the JS pop up//
    Alert a = driver.switchTo().alert();
    
   
    
    
    //clicks on ok button//
      a.accept();
    
    
  
}
}

