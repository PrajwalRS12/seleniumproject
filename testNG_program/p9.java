package testNG_program;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//program for @parameters annotation
public class p9 {
     @Parameters("course")
	@Test 
	public void demoscript(String data)
	{
		System.out.println(data);
	}
	
}
