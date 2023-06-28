package testNG_program;

import org.testng.Assert;
import org.testng.annotations.Test;

public class p23 {

	@Test(dependsOnMethods= {"loginscript"})
	public void usersScript()
	{
		System.out.println("users script");
		Assert.fail();
	}
	

	@Test(dependsOnMethods= {"loginscript","usersScript"})
	public void adduserScript()
	{
		System.out.println("add user script");
		
	}
	

	@Test
	public void loginscript()
	{
		System.out.println("login script ");
		Assert.fail();
	}
}
