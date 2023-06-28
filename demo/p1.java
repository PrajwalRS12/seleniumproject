package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	public static void main(String[] args) {
		
		
		
		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		
		
		/*launches the chrome browser*/
		ChromeDriver driver=new ChromeDriver();
		
		
		
		
		
		/*fetches the web app and waits until the page is loaded*/
		driver.get("https://www.amazon.com");
	}

}
