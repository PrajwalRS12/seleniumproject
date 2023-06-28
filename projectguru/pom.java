package projectguru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom 
{
	@FindBy(name="uid")
public WebElement username ;
	
	
	@FindBy(name="password")
public WebElement password ;
		 
	@FindBy(name="btnLogin")
public WebElement clickbtn ;


	
	public void login (String un, String pw)
	{
		this.username.sendKeys(un);
		this.password.sendKeys(pw);
		this.clickbtn.click();
		
	}
	public pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
		
		
		

