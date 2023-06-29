package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.baseTest;
import pages.initialisePages;

public class loginScript  extends baseTest

{

	
	@Test
	public void loginScript()
	{
		initialisePages pages = new initialisePages(driver);
		
		pages.actitimeLogin.login(p.getProperty("username"),p.getProperty("password"));
		
		actionUtil.validateTitle("actiTIME - Enter Time-Trck");
	}
	
}
