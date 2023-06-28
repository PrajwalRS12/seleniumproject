package autoSuggestion_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) throws InterruptedException
	{
	/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
	/*launches the chrome browser*/
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();



driver.get("https:/www.google.co.in");



driver.findElement(By.name("q")).sendKeys("selenium");


Thread.sleep(1000);

/*identifies all the auosuggestion*/
List<WebElement> autosuggestions =driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));


/*retrieves the text from all autosuggestions*/
for (WebElement lv:autosuggestions)

{
	String text = lv.getText();
	System.out.println(text);
	
	
}

/*close the browser*/
driver.quit();

	}

			
}
