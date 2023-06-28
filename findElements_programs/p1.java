package findElements_programs;

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
       WebDriver driver = new ChromeDriver();

/*maximize the window*/
      driver.manage().window().maximize();
/*fetches the web app and waits and until thr pages is loaded*/
     driver.get("https://www.facebook.com/");

/*identifies all the matching webelements*/
List<WebElement> links = driver.findElements(By.xpath("//a"));


/*returns the size of the list*/
System.out.println(links.size());

/*returns the type of list*/
System.out.println(links.getClass().getName());


for(WebElement lv:links)
{
	System.out.println(lv.getText());
}





	}
}

