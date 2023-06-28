package screenshot_programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
	public static void main(String[] args) throws IOException {
		/* sets the path for chromedriver.exe*/
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			
		/*launches the chrome browser*/
			WebDriver driver =new ChromeDriver();
			
			
		/*fetches the web app and waits until the page is loaded*/
			driver.get("https://www.facebook.com");
			
			
			//retrieves the title of the webpage//
			String title = driver.getTitle();
			
			
			
		/*maximizes the window*/
			driver.manage().window().maximize();
			
			
			
		//converts the object from webdriver to screenshot type//	
			TakesScreenshot t = (TakesScreenshot)driver;
			
			
		//capture the screenshot and return it in the form of an object of fileclass//	
			File src = t.getScreenshotAs(OutputType.FILE);
			
			
		//creates the file class object for the physical file//	
			File dest = new File("./screenshot/"+title+".png");
			
			
			//copies the content from src to dest//
			FileUtils.copyFile(src,dest);
			
}
}