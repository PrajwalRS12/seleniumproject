package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p9 
{
	
	public static void main(String[] args) throws InterruptedException
	
	{
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
       WebDriver driver = new ChromeDriver();

/*maximize the window*/
      driver.manage().window().maximize();
/*fetches the web app and waits and until thr pages is loaded*/
     driver.get("file:///C:/Users/Thejaswi%20R%20S/Downloads/eclipse-java-2018-09-win32-x86_64/eclipse/selenium.3.html");

/*identifies the first textbox and enters data*/
driver.findElement(By.cssSelector("input[tabindex='1']")).sendKeys("java");

/*identifies the second textbox and enters data*/
      driver.findElement(By.cssSelector("input[tabindex='2']")).sendKeys("selenium");


	} 

}
