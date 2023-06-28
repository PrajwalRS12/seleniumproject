

package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p11 {
public static void main(String[] args) throws InterruptedException
	
	{
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
       WebDriver driver = new ChromeDriver();

/*maximize the window*/
      driver.manage().window().maximize();
/*fetches the web app and waits and until the pages is loaded*/
     driver.get("https://demo.actitime.com/login.do");

/*identifies the username and enters data*/
driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");

/*identifies the password and enters data*/
      driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
      
/*identifes the loginbutton and clicks*/
      driver.findElement(By.cssSelector("a[id='loginButton']")).sendKeys(Keys.ENTER);
      

	} 

}



