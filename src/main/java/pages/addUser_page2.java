package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addUser_page2 {
 
	
	//identifies firstname//
		@FindBy(xpath="(//input[@name='firstName'])[2]")
		 private WebElement tbFirstName;
		

	//identifies lastname//
		@FindBy(xpath="(//input[@name='lastName'])[2]")
		 private WebElement tbLastName;
		
	//identifies email//
				@FindBy(xpath="(//input[@name='email'])[2]")
				 private WebElement tbEmail;
				
	//identifies saves and send inivitation//
			@FindBy(xpath="//div[text()='Save & Send Invitation']")
			 private WebElement btnSave;
			
			
			public void createUser(String fn, String ln,String em)
			{
				this.tbFirstName.sendKeys(fn);
				this.tbLastName.sendKeys(ln);
				this.tbEmail.sendKeys(em);
				this.btnSave.click();	
			}
			

			//constructor//
					public addUser_page2(WebDriver driver)
					{
						//initialises the webelements//
						PageFactory.initElements(driver, this);
					}
		
}
