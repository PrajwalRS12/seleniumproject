package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10 {
	public static void main(String[] args) throws InterruptedException
	
	{
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
       WebDriver driver = new ChromeDriver();

/*maximize the window*/
      driver.manage().window().maximize();
/*fetches the web app and waits and until thr pages is loaded*/
     driver.get("https://www.facebook.com/");

/*identifies the first textbox and enters data*/
driver.findElement(By.cssSelector("input[name='email']")).sendKeys("java");

/*identifies the second textbox and enters data*/
      driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("selenium");
      
      
      driver.findElement(By.cssSelector("button[name='login']")).submit();
      

	} 

}

