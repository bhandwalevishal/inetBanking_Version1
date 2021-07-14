  package com.inetBanking.testCases1;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.testCases1.BASE_CLASS;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;



public class TC_Login_001 extends BASE_CLASS  
{

  @Test
  public void loginTest() throws InterruptedException, IOException
  {
	  
	  
      // driver.get(baseUrl);
      logger.info("URL is Opened");
      
       LoginPage lp=new LoginPage(driver);     
       lp.setUserName(username); 
       logger.info("Username is Entered");
       
       lp.setPassword(password);
       Thread.sleep(4000);
       logger.info("Password is Entered");
       
       String st="";
      st=driver.getTitle();
     
      //System.out.println("The Page Title is : "+st);   
      
      if(st.equals("Guru99 Bank Home Pa"))
      {
        System.out.println("The title of Webpage is correct");  
        System.out.println("Actual Title: Guru99 Bank Home Page");
        System.out.println("Expected Title: "+st);
        logger.info("TC_Login_001 : PASS");
      }
      else 
      {
    	captureScreen(driver,"TC_Login_001");    	
    	System.out.println("The title of Webpage is Incorrect");
    	System.out.println("Actual Title: Guru99 Bank Home Page");
        System.out.println("Expected Title: "+st);
        logger.info("TC_Login_001 : FAILED");
        
      }
      Thread.sleep(4000);
      lp.clickSubmit();
      
      
     // driver.manage().timeouts().pageLoadTimeout(duration)
  }
  
 
 
}
