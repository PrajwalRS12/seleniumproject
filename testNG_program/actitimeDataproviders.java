package testNG_program;

import org.testng.annotations.DataProvider;

import apache_programs.p4;

public class actitimeDataproviders {


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
	
	//dataprovider which provides logindata to the script//
	@DataProvider
	public Object[][] addUserData() throws Throwable
	{
		Object[][] data = new Object[1][5];
		data[0][0]=p4.getData("login",1,0);
		data[0][1]=p4.getData("login",1,1);
		data[0][2]=p4.getData("adduser",1, 0);
		data[0][3]=p4.getData("adduser",1,1);
		data[0][4]=p4.getData("adduser",1,2);
		return data;
	}
	
}

