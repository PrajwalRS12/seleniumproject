package webelement_programs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
	public class p1
	{
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
		WebElement link = driver.findElement(By.id("i1"));
		
		link.click();
		
		
/*identifies the webelement in the webpage with  name =n1*/
		WebElement link1 =driver.findElement(By.name("n1"));
		      //duplicate local link=error//
		link1.click();
	}
	}
		
		


