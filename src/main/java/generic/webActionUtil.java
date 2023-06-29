package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class webActionUtil
{
  WebDriver driver;
  
  public webActionUtil(WebDriver driver)
  {
	  this.driver=driver;
  }
  
	public static String  getData(String excelPath,String sheetName,int row,int col)
	{
		
		try 
		{
			FileInputStream f1 = new FileInputStream(excelPath);
			Workbook book = WorkbookFactory.create(f1);
			String d = book.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
			return d;
		} 
		catch (Exception e) 
		{
			return null;
		}
					
	}
	public void validateTitle(String expectedTitle)	
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));	
			wait.until(ExpectedConditions.titleIs(expectedTitle));
			System.out.println("Pass:Title is matching");
		} 
		catch (Exception e)
		{
			System.out.println("Fail:Title is not matching");
			Assert.fail();
		}
	}
	public void validateElementVisibility(WebElement element)	
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));	
			wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println("Pass:element is visible");
		} 
		catch (Exception e)
		{
			System.out.println("Fail:element is not visible");
			Assert.fail();
		}
	}
	public void captureScreenshot(String scriptName)
	{	
		TakesScreenshot t = (TakesScreenshot)driver;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(baseTest.userDir+"\\screenshot\\"+scriptName+".png");
		try 
		{
		FileUtils.copyFile(src,dest);
	    }
		catch(IOException e)
		{
		}
		}
	
}
