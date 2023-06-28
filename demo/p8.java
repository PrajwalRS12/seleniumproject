package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8 {

	public static void main(String[] args) throws InterruptedException
	{
	/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
	/*launches the chrome browser*/
		WebDriver driver =new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
	/*fetches the web app and waits until the page is loaded*/
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");

		
		Thread.sleep(1000);
		
		
		/*identifies and clicks on follow on twitter*/
		driver.findElement(By.partialLinkText("Follow On Twitter")).click();
		
		/*identifies and clicks on link us on facebook*/
		driver.findElement(By.partialLinkText("Like us On Facebook")).click();;
		
		
		
		String mainWindow = driver.getWindowHandle();
		
		System.out.println(mainWindow);
		
		
		Set<String> allWindows = driver.getWindowHandles();
		/*returns the reference of the main window*/
		System.out.println(allWindows);
		
		/*returns the reference of the all the window*/
		System.out.println(allWindows.getClass().getName());
		
		for(String lv:allWindows)
		{
			
/*switches the control from one window to another*/			
			driver.switchTo().window(lv);
			/*close the window*/
			driver.close();
			/*pauses the program for 1sec*/
			Thread.sleep(1000);
		}
		
		
	}
	
	

}
