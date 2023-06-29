package scripts;

import org.testng.annotations.Test;

import dataproviders.actitimeDataProviders;
import generic.baseTest;
import pages.initialisePages;

public class addUserScript extends baseTest 
{
 
	@Test(dataProviderClass=actitimeDataProviders.class,dataProvider="addUserData")
public void adduserScript(String un,String pw,String fn,String ln,String em) throws InterruptedException
  {
	initialisePages pages = new initialisePages(driver);
	pages.actitimeLogin.login(un,pw);
	pages.actitimeEnterTimeTrack.clickusers();
	pages.actitimeUsersList.clickNewusers();
	pages.addUser.createUser(fn,ln,em);
   }
}