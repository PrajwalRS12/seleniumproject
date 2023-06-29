package dataproviders;

import org.testng.annotations.DataProvider;

import generic.baseTest;
import generic.webActionUtil;

public class actitimeDataProviders {

	
	@DataProvider
	public Object[][] addUserData() throws Throwable
	{
		Object[][] data = new Object[1][5];
		data[0][0]=webActionUtil.getData(baseTest.excelPath,"login", 1,0);
		data[0][1]=webActionUtil.getData(baseTest.excelPath,"login",1,1);
		data[0][2]=webActionUtil.getData(baseTest.excelPath,"adduser",1, 0);
		data[0][3]=webActionUtil.getData(baseTest.excelPath,"adduser",1,1);
		data[0][4]=webActionUtil.getData(baseTest.excelPath,"adduser",1,2);
		return data;
	}
}
