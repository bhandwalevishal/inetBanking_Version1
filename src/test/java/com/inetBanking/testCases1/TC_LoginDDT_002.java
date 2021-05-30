package com.inetBanking.testCases1;

import java.io.IOException;

 
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.XLUtils;

import junit.framework.Assert;

public class TC_LoginDDT_002 extends BASE_CLASS

{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
	    logger.info("user name is provided ");
		lp.setPassword(pwd);
		logger.info("password is provided ");
		lp.clickSubmit();
		
		
		Thread.sleep(3000);
		
		if(IsAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login Failed");
		}
		else 
		{
			Assert.assertTrue(true);
			logger.warn("Login Passed");
			Thread.sleep(3000);
			lp.clicklnkLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent(); //close logout alert
			
		}
		
		
		
	}

	
	public boolean IsAlertPresent()//user defined method to check alert present or not 
	{ 
		try{
		driver.switchTo().alert();
		return true;
		}
		catch(Exception e)
		{
			return false;	 
		}
		
	}
	
/*******************************************************************************************************************/ 
	@DataProvider(name="LoginData")
	
	String[][] getData() throws IOException
	{
		String Path=System.getProperty("user.dir") +"/src/test/java/com/inetBanking/testData/LoginData.xlsx";
		int rownum=XLUtils.getRowCount(Path, "Sheet1");
		int colcount=XLUtils.getCellCount(Path, "Sheet1", 1);
		
		String loginData[] []= new String[rownum][colcount];
		
		
		for(int i=1;i<=rownum;i++)
		{
			
			for(int j=0;j<colcount;j++)
			{
				loginData[i-1][j]=XLUtils.getCellData(Path, "Sheet1", i, j);
				System.out.println("VAlue of J: "+j);
			}
		System.out.println("VAlue of I: "+i);
		
		}
		
		return loginData;
		
	}
/*******************************************************************************************************************/ 
	
	
}



