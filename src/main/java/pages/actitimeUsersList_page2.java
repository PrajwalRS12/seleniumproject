package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeUsersList_page2 {

	
	//identifies departments//
	@FindBy(xpath="(//div[contains(text(),'Departments')])[1]")
	 private WebElement btnDepartments;
	

	//identifies new users//
	@FindBy(xpath="//div[text()='New User']")
	 private WebElement btnNewUser;
	

	//identifies departments//
	@FindBy(xpath="//div[text()='Bulk Invitations']")
	 private WebElement btnBulkInvitations;
	
	//method to click Departments//
	public void clickDepartments()
	{
		this.btnDepartments.click();
		
	}
	
	//method to click Newusers//
	public void clickNewusers ()
	{
		this.btnNewUser.click();
		
	}
	
	
	//method to click BulkInivitations//
	public void clickBulkInivitations()
	{
		this.btnBulkInvitations.click();
		
	}
	
	//constructor//
			public actitimeUsersList_page2(WebDriver driver)
			{
				//initialises the webelements//
				PageFactory.initElements(driver, this);
			}
	
}
