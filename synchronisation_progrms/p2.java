package synchronisation_progrms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {


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

   //retrieves the title of loginpage//   
    String loginPageTitle= driver.getTitle();
     System.out.println(loginPageTitle);
     
     
     
/*identifies userame and enters data*/
driver.findElement(By.name("username")).sendKeys("admin");

/*password and enter data*/
      driver.findElement(By.name("pwd")).sendKeys("manager");

/*identifies loginbutton and clicks*/
      driver.findElement(By.id("loginButtonContainer")).click();
  
  
 /*pause the execution for 4sec*/
       Thread.sleep(3000);
   
 
       //retrieves the title of landing page//   
       String loginPageTitle1= driver.getTitle();
        System.out.println(loginPageTitle1);
            
}
	
}

