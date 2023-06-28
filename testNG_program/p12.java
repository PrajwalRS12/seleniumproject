package testNG_program;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class p12 
 {
	@DataProvider
	public Object[] demoData()
	{
	Object[] data = new Object[5];
	data[0]= "java";
	data[1]= 100;
	data[2]= 25.5f;
	data[3]= true;
	data[4]= '$';
	return data;
	}

	@Test(dataProvider="demoData")
	public void script(Object obj)
	{
		System.out.println(obj);
	}

	
 
	
 
	
 }
