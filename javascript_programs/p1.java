package javascript_programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {


	public static void main(String[] args) throws InterruptedException
	
	{
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
       WebDriver driver = new ChromeDriver();

/*maximize the window*/
      driver.manage().window().maximize();

      
/*fetches the web app and waits until the page is loaded completely*/      
     driver.get("file:///C:/Users/Thejaswi%20R%20S/Downloads/eclipse-java-2018-09-win32-x86_64/eclipse/selenium.8.html");

 //converts the object from webdriver type to javascriptexecutor type//    
     JavascriptExecutor j = (JavascriptExecutor)driver;
     
 //enter the data into disabled textbox//    
     j.executeScript("document.getElementById('i1').value='selenium'");
     
     
	}
}
