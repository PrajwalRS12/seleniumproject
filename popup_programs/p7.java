package popup_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program to close child browser pop up//
public class p7 {
	

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
			driver.findElement(By.partialLinkText("Follow On Twitter")).click();;
			
			/*identifies and clicks on link us on facebook*/
			driver.findElement(By.partialLinkText("Like us On Facebook")).click();;
			
			
			
			String mainWindow = driver.getWindowHandle();
			
			System.out.println(mainWindow);
			
			
			Set<String> allWindows = driver.getWindowHandles();
			/*returns the reference of the main window*/
			System.out.println(allWindows);
			
			/*returns the reference of the all the window*/
			System.out.println(allWindows.getClass().getName());
			
			
			/*invokes the multiple window*/
			multipleWindows(driver);
			
			/*retrieves the title of the window*/
			 System.out.println(driver.getTitle());
			
		} 
			 
			 public static void multipleWindows(WebDriver driver) throws InterruptedException
			{
				
				
	/*returnss the reference of the main window*/			
				String mainWindow =driver.getWindowHandle();
				
			/*returns the reference of all window*/
				Set<String> allWindows = driver.getWindowHandles();
				
				
				
				for(String lv : allWindows)
				{ 
					
					                          
					
				/*Switches the control from one	window to another window*/
					
					driver.switchTo().window(lv);
					

				if(!lv.equals(mainWindow))
				{ 
					driver.close();
				
				}
				/*switches the control to mainwindow*/
				driver.switchTo().window(mainWindow);
				
				}
			}
		
	}





