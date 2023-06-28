package testNG_program;

import org.testng.annotations.Test;

public class p24 {

	
	@Test(groups= {"smoke"})
	public void script1()
	{
		System.out.println("script1");
	}
	
	@Test(groups= {"functional"})
	public void script2()
	{
		System.out.println("script2");
	}
	
	@Test(groups= {"functional"})
	public void script3()
	{
		System.out.println("script3");
	}
	
	
	@Test(groups= {"smoke","integration"})
	public void script4()
	{
		System.out.println("script4");
	}
	
	
	@Test(groups= {"integration"})
	public void script5()
	{
		System.out.println("script5");
	}
	
	
}
