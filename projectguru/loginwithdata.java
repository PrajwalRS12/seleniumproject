package projectguru;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class loginwithdata {

	
	
	public static String getdata(String un ,int a ,int b) throws Throwable
	
	{
		FileInputStream f = new FileInputStream("./data/excelguru.xlsx");
		
		Workbook book = WorkbookFactory.create(f);
		 
		String d = book.getSheet(un).getRow(a).getCell(b).getStringCellValue();
		
		return d;
		
	}
	  
	
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		   ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.demo.guru99.com/v4/");
		pom obg = new pom(driver);
		
		obg.login(getdata("sheet1", 2, 0) , getdata("sheet1",2 , 1));
		
		
	}
	
	
}
