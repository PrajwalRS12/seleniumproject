package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM page for landing page//
public class actitimeEnterTimeTrack_Page {

	//identifies tasks//
	@FindBy(xpath="//a[@class='content tasks']")
	public WebElement lnkTasks;
	
	

	//identifies reports//
	@FindBy(xpath="//a[@class='content reports']")
	public WebElement lnkReports;
	
	

	//identifies users//
	@FindBy(xpath="//a[@class='content users']")
	public WebElement lnkUsers;
	
	

	//identifies logout//
	@FindBy(xpath="//a[@id='logoutLink']")
	public WebElement btnLogout;

	
	//constructor//
			public actitimeEnterTimeTrack_Page(WebDriver driver)
			{
				//initialises the webelements//
				PageFactory.initElements(driver, this);
			}
}
