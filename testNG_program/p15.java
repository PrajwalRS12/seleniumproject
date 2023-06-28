package testNG_program;

import org.testng.annotations.Test;

//program for priority//
public class p15 
{
     @Test(priority=10)
	   public void facebook()
	{
	System.out.println("from facebook script");
	}

   @Test(priority=1)
  public void myntra()
     {
      System.out.println("from myntra script");
     }

       @Test(priority=5)
       public void actitime()
    {
   System.out.println("from actitime script");
    
    }

}
