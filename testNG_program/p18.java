package testNG_program;

import org.testng.annotations.Test;

public class p18 {
 
	
	     @Test(invocationCount=10)
		   public void facebook()
		{
		System.out.println("from facebook script");
		}

	   @Test(invocationCount=1)
	  public void myntra()
	     {
	      System.out.println("from myntra script");
	     }

	       @Test(invocationCount=5)
	       public void actitime()
	    {
	   System.out.println("from actitime script");
	    
	    }

	}

