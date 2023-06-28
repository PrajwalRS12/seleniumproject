package webelement_programs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
	public class p6 {
		
	
		public static void main(String[] args) 
	
	{
		
/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		
		
/*launches the chrome browser*/
		WebDriver driver =new ChromeDriver();
		
/*maximize the window*/
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Thejaswi%20R%20S/OneDrive/Desktop/selenium.2.html");
		
		
		
		WebElement textBox = driver.findElement(By.id("i1"));
		
		
		
		
		textBox.sendKeys("selenium"); 
	}
	}
		
		
		
		
		

