package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeUsersList_page {

	
	//identifies departments//
	@FindBy(xpath="(//div[contains(text(),'Departments')])[1]")
	public WebElement btnDepartments;
	

	//identifies new users//
	@FindBy(xpath="//div[text()='New User']")
	public WebElement btnNewUser;
	

	//identifies departments//
	@FindBy(xpath="//div[text()='Bulk Invitations']")
	public WebElement btnBulkInvitations;
	
	
	//constructor//
			public actitimeUsersList_page(WebDriver driver)
			{
				//initialises the webelements//
				PageFactory.initElements(driver, this);
			}
	
}
