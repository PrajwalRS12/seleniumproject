package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM page for landing page//
public class actitimeEnterTimeTrack_Page2 {

	//identifies tasks//
	@FindBy(xpath="//a[@class='content tasks']")
      private WebElement lnkTasks;
	
	

	//identifies reports//
	@FindBy(xpath="//a[@class='content reports']")
	 private WebElement lnkReports;
	
	

	//identifies users//
	@FindBy(xpath="//a[@class='content users']")
	 private WebElement lnkUsers;
	
	

	//identifies logout//
	@FindBy(xpath="//a[@id='logoutLink']")
	 private WebElement btnLogout;
	
	//method to click on tasks//
	public void clickTasks()

	{
		this.lnkTasks.click();
	}
	
	
	//method to click on reports//
	public void clickReports()

	{
		this.lnkReports.click();
	}
	
	

	//method to click on users//
	public void clickusers()

	{
		this.lnkUsers.click();
	}
	
	
	//method to click on logout//
	public void clickLogout()
	{
		this.btnLogout.click();
	}
	
	//constructor//
			public actitimeEnterTimeTrack_Page2(WebDriver driver)
			{
				//initialises the webelements//
				PageFactory.initElements(driver, this);
			}
}
