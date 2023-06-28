package POM_pages;

import org.openqa.selenium.WebDriver;

public class initialisePages 

   {


	public actitimeLogin_Page2 actitimeLogin;
	public actitimeEnterTimeTrack_Page2 actitimeEnterTimeTrack;
	public actitimeUsersList_page2 actitimeUsersList;
	public addUser_page2 addUser;
	
	
	
	public initialisePages(WebDriver driver)
	
	{
	
	this.actitimeLogin = new actitimeLogin_Page2(driver);
	this.actitimeEnterTimeTrack = new actitimeEnterTimeTrack_Page2(driver);
	this.actitimeUsersList = new actitimeUsersList_page2(driver);
	this.addUser = new addUser_page2(driver);
	
    }
}