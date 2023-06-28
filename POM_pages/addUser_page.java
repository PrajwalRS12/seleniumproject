package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addUser_page {
 
	
	//identifies firstname//
		@FindBy(xpath="(//input[@name='firstName'])[2]")
		public WebElement tbFirstName;
		

	//identifies lastname//
		@FindBy(xpath="(//input[@name='lastName'])[2]")
		public WebElement tbLastName;
		
	//identifies email//
				@FindBy(xpath="(//input[@name='email'])[2]")
				public WebElement tbEmail;
				
	//identifies saves and send inivitation//
			@FindBy(xpath="//div[text()='Save & Send Invitation']")
				public WebElement btnSave;
			

			//constructor//
					public addUser_page(WebDriver driver)
					{
						//initialises the webelements//
						PageFactory.initElements(driver, this);
					}
		
}
