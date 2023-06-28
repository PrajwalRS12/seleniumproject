package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM page for login  page//
public class actitimeLogin_Page

{

	//identifies username//
	@FindBy(name="username")
	public WebElement tbusername;
	
	//identifies password//
	@FindBy(name="pwd")
	public WebElement tbPassword;
	
	//identifies loginbutton//
	@FindBy(id="loginButton")
	public WebElement btnLogin;
	
	//constructor//
		public actitimeLogin_Page(WebDriver driver)
		{
			//initialises the webelements//
			PageFactory.initElements(driver, this);
		}
}

