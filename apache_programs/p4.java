package apache_programs;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//method to read the data from excel//
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actitimeLogin_Page2;
public class p4 
{

	public static String getData(String sn,int r,int c)throws Throwable  
	  {
		
		//reads the data from excel//
				FileInputStream f1=new FileInputStream("./data/myexcel.xlsx");
				//creates the workspace in the memory//
				Workbook book = WorkbookFactory.create(f1);
				
				//reads the data from specified row and columns//
				String d = book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
				
				
				//returns the data//
				return  d;
				
	}
	public static void main(String[] args)  throws Throwable
	{
		

		/* sets the path for chromedriver.exe*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");



		/*launches the chrome browser*/
		       WebDriver driver = new ChromeDriver();

		     //defines implictly wait of 30 sec//  
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		       //works for findelement() only//
		     
		/*maximize the window*/
		      driver.manage().window().maximize();

		     driver.get("https://demo.actitime.com/login.do");

				//creates an object of actitimeLoginPage class//
				actitimeLogin_Page2 ob = new actitimeLogin_Page2(driver);
	
				
				
				ob.login(getData("login",1,0),getData("login",1,1));
				
			} 
		

	}

	
	
	
	

