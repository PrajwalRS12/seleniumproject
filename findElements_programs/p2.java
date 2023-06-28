package findElements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  
/*program to retrieve the text*/
public class p2 {
	public static void main(String[] args) 
	{
/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		
		
/*launches the chrome browser*/
		WebDriver driver =new ChromeDriver();
		
/*maximize the window*/
		driver.manage().window().maximize();
		
		
/*fetches the web app and waits the page is loaded*/
		driver.get("file:///C:/ProgramData/MySQL/MySQL%20Server%208.0/selenium1.html");
		
		
/*identifies the webelement in the webpage with  id =i1*/
		WebElement link=driver.findElement(By.id("i1"));
		
		
/*retrieves the text of the webelement from the html code*/		
		System.out.println(link.getText());
		
		
		
		
	}
}
