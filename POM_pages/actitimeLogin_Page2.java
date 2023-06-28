package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM page for login  page//
public class actitimeLogin_Page2

{	
	//identifies username//
	@FindBy(name="username")
	 private WebElement tbUsername;
	
	
	//identifies password//
	@FindBy(name="pwd")
	 private WebElement tbPassword;
	
	//identifies loginbutton//
	@FindBy(id="loginButton")
	 private WebElement btnLogin;
	
	//method to enter usernames//
	public void setUsername(String un)
	{
		this.tbUsername.sendKeys(un);
	}
	
	//method to enter password//
		public void setPassword(String pw)
		{
			this.tbPassword.sendKeys(pw);
		}
		
	//method to enter usernames//
		public void clickLogin()
		{
			this.btnLogin.click();
		}
		
		//method to login into the app//
		
		public void login(String un,String pw)
		{
			this.tbUsername.sendKeys(un);
			this.tbPassword.sendKeys(pw);
			this.btnLogin.click();
		}
	//constructor//
		public actitimeLogin_Page2(WebDriver driver)
		{
			//initialises the webelements//
			PageFactory.initElements(driver, this);
		}
}
