package com.inetBanking.testCases1;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddNewCustomer;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BASE_CLASS {
	
    @Test
	public void addNewCustmrer() throws InterruptedException, IOException
	{
    	LoginPage lp=new LoginPage(driver);
	    lp.setUserName(username);  		
	    lp.setPassword(password);
	    lp.clickSubmit();
	 
	    Thread.sleep(3000);
	    
	    
	    AddNewCustomer addCust=new AddNewCustomer(driver);
	    driver.manage().window().maximize();
	    addCust.clickAddNewCustomer();
	    addCust.custName("Vishal Bhandwale");
	    addCust.custGender("male");
	    addCust.cDateOfBirth("01/", "01/", "1994");
	    Thread.sleep(4000);
	    
	    addCust.cAddress("Plot no 11 Samarth Nagar Jalna ");
	    addCust.cCity("Jalna");
	    addCust.cState("Maharashtra");
	    addCust.cPin("431203");
	    addCust.CMobileNumber("9420739262");
	    String Email=randomstring()+"@gmail.com";
	    addCust.cEmailID(Email);
	    addCust.cPassword("Vishal@1234");
	      
	    Thread.sleep(8000); 
	    addCust.cSubmit();
	    Thread.sleep(8000); 
	    
	   boolean res= driver.getPageSource().contains("Customer Registered Successfully!!!");
	
	   
	   if (res==true)
	   {
		   Assert.assertTrue(true);
		   logger.info("TC_Login_001 : Passed");
	   }
	   else 
	   {
		   captureScreen(driver,"addNewCustomer");
		   Assert.assertTrue(false);
		   logger.info("TC_Login_001 : Failed");
	   }
	   
	}
	
	public String randomstring()
	{
	   String generatedString = RandomStringUtils.randomAlphabetic(8);
	   return (generatedString);
	}
	
	
}
