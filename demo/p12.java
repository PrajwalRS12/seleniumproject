package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*program for  handle multiple tab*/
public class p12 {


	public static void main(String[] args) throws InterruptedException
	
	{
	/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
	/*launches the chrome browser*/
		WebDriver driver =new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
	/*fetches the web app and waits until the page is loaded*/
		driver.get("https://demo.actitime.com/login.do");

		
		Thread.sleep(1000);
		
	
		
		/*identifies and clicks on link us on facebook*/
		driver.findElement(By.partialLinkText("actiTIME Inc.")).click();;
		
		
		
		String mainTab = driver.getWindowHandle();
		
		System.out.println(mainTab);
		
		
		Set<String> allTabs = driver.getWindowHandles();
		
		/*returns the reference of the main window*/
		System.out.println(allTabs);
		
		/*returns the reference of the all the window*/
		System.out.println(allTabs.getClass().getName());
		
		
		/*Invokes the multiple window*/
		multipleTabs(driver);
		
		/*Retrieves the title of the window*/
		 System.out.println(driver.getTitle());
		
	} 
		 
		 
	

		public static void multipleTabs(WebDriver driver) throws InterruptedException
		{
			
			
/*Returns the reference of the main window*/			
			String mainTab =driver.getWindowHandle();
			
		/*returns the reference of all window*/
			Set<String> allTabs = driver.getWindowHandles();
			
			
			
			for(String lv : allTabs)
			{ 
				/*switches the control from one tab to another*/
				driver.switchTo().window(lv);
				 /*closes the main tab*/
				if(lv.endsWith(mainTab))
				{
					driver.close();
  				}
				
			}
				
				
			
		}
	
}


