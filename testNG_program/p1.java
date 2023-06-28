package testNG_program;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class p1 


{

	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("from before suite");
	}
	
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("from After suite");
	}

	@BeforeTest 
	public void BeforeTest()
	{
		System.out.println("from before test");
	}

   @AfterTest 
   public void AfterTest ()
    {
	System.out.println("from after test");
    }
   

   @BeforeClass
   public void BeforeClass()
    {
	System.out.println("from before class");
    }

   @AfterClass
   public void Afterclass()
    {
	System.out.println("from after class");
    }
   
   @BeforeMethod
   public void BeforeMethod()
   {

		System.out.println("from before method");  
   }
   
   @AfterMethod
   public void AfterMethod()
   {

		System.out.println("from after method");  
   }
   
   @Test
   public void  test()
   {
	   System.out.println("from test or script");
   }

   
 }
   
   
  

