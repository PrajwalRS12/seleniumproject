package findElements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {
	public static void main(String[] args) throws InterruptedException
	{
	/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
	/*launches the chrome browser*/
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();

	/*navigates to the specified url*/
		driver.get("https://www.flipkart.com");	
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		/*identifies search box and enters data*/
		 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("woodland shoes");
		
		/*identifies and clicks on search button*/
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();



						
	/*pause for 3 sec*/	
	Thread.sleep(3000);
	
	
	/*identifies the title of all the shoes*/
	List<WebElement> titles =driver.findElements(By.xpath("//a[@class='IRpwTa']"));

		
			
	/*retieves and prints the text from every title*/
			for(WebElement lv:titles)
			{
				System.out.println(lv.getText());
			}

	/*identifies the prices of all the shoes*/
	List<WebElement> prices =driver.findElements(By.xpath("//a[@class='IRpwTa']/..//div[@class='_30jeq3']"));

			
			for(int i=0; i<titles.size(); i++)
			{
				String title = titles.get(i).getText();
				String price = prices.get(i).getText();
		        System.out.println(title+"="+price);
			}
			
			
		/*close the browser*/
			
			driver.quit();


	}
		
}


