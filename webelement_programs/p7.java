package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p7 {

	public static void main(String[] args) throws InterruptedException  {
		

/* sets the path for chromedriver.exe*/
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



/*launches the chrome browser*/
WebDriver driver =new ChromeDriver();

/*maximize the window*/
driver.manage().window().maximize();

driver.get("https://www.facebook.com/");


/*identifies user text box*/
WebElement username = driver.findElement(By.id("email"));

/*enters data into username*/
username.sendKeys("abhi");

/*identifies password textbook*/
WebElement password = driver.findElement(By.id("pass"));

/*enters data into username*/
password.sendKeys("aaaaa");

/*identifies loginbutton*/
WebElement loginButton = driver.findElement(By.name("login"));


/*clicks on;oginbutton*/
loginButton.click();


Thread.sleep(4000);
}


}





